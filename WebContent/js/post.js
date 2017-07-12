//在页面加载完后立即执行多个函数。
function addloadEvent(func) {
    var oldonload = window.onload;
    if (typeof window.onload != "function") {
        window.onload = func;
    }
    else {
        window.onload = function () {
            if (oldonload) {
                oldonload();
            }
            func();
        }
    }
}
addloadEvent(b);

function b() {
    var pn = document.getElementById("pn");
    var lists = pn.children;
    //删除当前节点
    function remove(node) {
        node.parentNode.removeChild(node);
    }

    //回复评论
    function reply(box) {
        //获取评论框
        var textarea = box.getElementsByTagName("textarea")[0];
        //获取包含所有评论的容器
        var comment = box.getElementsByClassName("comment-list")[0];
        //创建新的评论div
        var div = document.createElement("div");
        //赋类名
        div.className = "comment-list";
        //设置属性
        div.setAttribute("user", "self");
        //获取每条评论的innerHTML结构，每次只替换textarea的输入内容和 当前发送时间
        var html = '<div class="comment">' +
                    '<div class="comment-text"><span>userName：</span>'
                    + textarea.value +
                    '</div>' +
                     '<div class="comment-date">' +
                     getTime() +
                     '<a class="comment-dele" href="javascript:;">回复</a>' +
                    '</div>' +
                 '</div>';
        //插入到新建的评论div
        div.innerHTML = html;
        //把新评论插入到评论列表
        comment.appendChild(div);
        //评论后初始化textarea输入框
        textarea.value = "评论…";
        textarea.parentNode.className = "hf";
    }
    //获取当前时间回复评论时调用
    function getTime() {
        var t = new Date();
        var y = t.getFullYear();
        var m = t.getMonth() + 1;
        var d = t.getDate();
        var h = t.getHours();
        var mi = t.getMinutes();
        m = m < 10 ? "0" + m : m;
        d = d < 10 ? "0" + d : d;
        h = h < 10 ? "0" + h : h;
        mi = mi < 10 ? "0" + mi : mi;
        return y + "-" + m + "-" + d + "" + h + ":" + mi;
    }
   
    //遍历所有状态消息
    for (var i = 0; i < lists.length; i++) {
        //全部事件代理
        lists[i].onclick = function (e) {
            //获取当前点击事件
            var e = e || window.event;
            var el = e.srcElement;
            if (!el) {
                el = e.target;//兼容火狐
            }
            //判断点击的类名
            switch (el.className) {
                    //回复评论
                case "hf-btn hf-btn-on":
                    reply(el.parentNode.parentNode.parentNode);
                    break; 
            }
        }

        var textarea = lists[i].getElementsByClassName("hf-text")[0];
        //焦点事件
        textarea.onfocus = function () {
            this.parentNode.className = 'hf hf-on';
            this.value = this.value == '评论…' ? '' : this.value;
        }
        //失焦事件
        textarea.onblur = function () {

            if (this.value == '') {
                this.parentNode.className = 'hf';
                this.value = '评论…';
            }
        }
        //键盘事件
        textarea.onkeyup = function () {
            var len = this.value.length;
            var textParentNode = this.parentNode;
            var textBtn = textParentNode.children[1];
            var textNub = textParentNode.children[2];
            if (len == 0 /*|| len>100*/) {
                textBtn.className = "hf-btn";
            } else {
                textBtn.className = "hf-btn hf-btn-on";
                /*this.style.color="#333";	*/
            }
            textNub.innerHTML = len + "/100";
        }
    }
    //遍历结束
}
