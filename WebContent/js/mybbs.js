function deleteRow(obj) { 
    //获得触发对象的行号 input->td->tr
    var rowIndex = obj.parentElement.parentElement.rowIndex;
    obj.parentElement.parentElement.parentElement.deleteRow(rowIndex); //删除该行
}

function edit(obj) {

    var tr = obj.parentElement.parentElement;
    var col = tr.cells;
    var text = col[1].firstChild.value;
    var txt = document.createElement("input");
    txt.type = "text";
    txt.value = col[1].innerHTML;
    col[1].innerHTML = "";
    col[1].appendChild(txt);
    col[2].firstChild.value = "保存";
    col[2].firstChild.setAttribute("onclick", "save('" + obj + "')");
}
	
function save(obj) {
    
    var tr = obj.parentElement.parentElement;
    var col = tr.cells;
    var text = col[1].firstChild.value;
    col[1].innerHTML = text;
    col[2].firstChild.value = "修改";
    col[2].firstChild.setAttribute("onclick", "edit('" + obj + "')");
}

function searchOnfocus(obj) {
    if (obj.value == '请输入用户名...')
        obj.value = '';
    obj.style.color = '#ff0000';
    
}
function searchOnBlur(obj) {
    if (obj.value == '') {
        obj.value = '请输入用户名...';
        obj.style.color = '#98BC00';
    } else {
        obj.style.color = '#333';
    }
}
