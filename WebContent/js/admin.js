function addRow() {
    var addTable = document.getElementById("addboard");
    var row_index = addTable.rows.length - 1;       //新插入行在表格中的位置
    var newRow = addTable.insertRow(row_index);  //插入新行
    newRow.id = "row" + row_index;                 //设置新插入行的ID

    var col1 = newRow.insertCell(0);
    col1.innerHTML = "<input type='text' name='boardName' id='boardName'/>";

    var col2 = newRow.insertCell(1);
    col2.innerHTML = "<input name='del" + row_index + "' type='button' value='删除' onclick=\"delRow('row" + row_index + "')\" />&nbsp;<input id='edit" + row_index + "' type='button' value='修改' onclick=\"editRow('row" + row_index + "')\" />";

}

function delRow(rowId) {
    var row = document.getElementById(rowId).rowIndex;   //删除行所在表格中的位置
    var col = document.getElementById(rowId).cells;
    document.getElementById("addboard").deleteRow(row);
}

function editRow(rowId) {
    var row = document.getElementById(rowId).rowIndex;   //修改行所在表格中的位置
    var col = document.getElementById(rowId).cells;
    var text = col[0].innerHTML;
    col[0].innerHTML = "<input name='num" + row + "' style='width:40px;' type='text' value='" + text + "' />";
    col[1].lastChild.value = "确定";
    col[1].lastChild.setAttribute("onclick", "upRow('" + rowId + "')");

}

function upRow(rowId) {
    var row = document.getElementById(rowId).rowIndex;   //修改行所在表格中的位置
    var col = document.getElementById(rowId).cells;
    var text = col[0].firstChild.value;
    col[0].innerHTML = text;
    col[1].lastChild.value = "修改";
    col[1].lastChild.setAttribute("onclick", "editRow('" + rowId + "')");
}

$(document).ready(function () {
    $("#forbid").click(function () {

        $.ajax({
            type: "post",
            dataType: "json",
            url: "",
            data: {
                userID: userID,
                userState: userState
            },
            success: function (msg) {
                if (msg.ret) {
                    var data = msg.data;
                    data.userState = "禁言";
                }
            },
            error: function () {
                alert("禁止失败");
            }
        });
    });
});

$(function () {
    $("#btSearch").click(function () {
        var tbody = window.document.getElementById("tbody1");

        $.ajax({
            type: "post",
            dataType: "json",
            url: "",
            data: {
                userID: userID,
                userName: userName,
                userState: userState
            },
            success: function (msg) {
                if (msg.ret) {
                    var str = "";
                    var data = msg.data;

                    for (i in data) {
                        str += "<tr>" +
                        "<td>" + data[i].userID + "</td>" +
                        "<td>" + data[i].userName + "</td>" +
                        "<td>" + data[i].userState + "</td>" +
                        "</tr>";
                    }
                    tbody.innerHTML = str;
                }
            },
            error: function () {
                alert("查询失败");
            }
        });
    });
});


$(function () {
    $("#btnBoard").click(function () {
        var tbody = window.document.getElementById("tbody1");

        $.ajax({
            type: "post",
            dataType: "json",
            url: "",
            data: {
                boardName: $("#boardName").val()
            },
            success: function (msg) {
                if (msg.ret) {
                    var str = "";
                    var data = msg.data;

                    for (i in data) {
                        str += "<tr>" +
                        "<td>" + data[i].boardName + "</td>" +
                        "<td>" + "<input id='edit" + row_index + "' type='button' value='修改' onclick=\"editRow('row" + row_index + "')\" />" + "</td>" +
                        "</tr>";
                    }
                    tbody.innerHTML = str;
                }
            },
            error: function () {
                alert("查询失败");
            }
        });
    });
});

$(function () {
    $('#btnSubmit1').click(function () {
        $.ajax({
            type: "post",
            url: "",
            data: $("#boardForm").serialize(),
            success: function (msg) {
                if ((msg == "true")) {
                    alert("提交成功。");
                } else {
                    if (msg == "false") {
                        alert("提交失败。");
                    }
                }
            },
            error: function () {
                alert("提交失败");
            }
        });
    });
});


$(function () {//版主管理，实现增删
    $("#btnModerator").click(function () {
        var tbody = window.document.getElementById("tbody2");

        $.ajax({
            type: "post",
            dataType: "json",
            url: "",
            data: {
                boardName: $("#boardName").val(),
                moderatorName: $("#moderatorName").val()
            },
            success: function (msg) {
                if (msg.ret) {
                    var str = "";
                    var data = msg.data;

                    for (i in data) {
                        str += "<tr>" +
                        "<td>" + data[i].boardName + "</td>" +
                        "<td>" + data[i].moderatorName + "</td>" +
                        "<td>" + "<input id='edit" + row_index + "' type='button' value='修改' onclick=\"editRow('row" + row_index + "')\" />" + "</td>" +
                        "</tr>";
                    }
                    tbody.innerHTML = str;
                }
            },
            error: function () {
                alert("查询失败");
            }
        });
    });
});


$(function () {
    $('#btnSubmit2').click(function () {
        $.ajax({
            type: "post",
            url: "",
            data: $("#moderatorForm").serialize(),
            success: function (msg) {
                if ((msg == "true")) {
                    alert("提交成功。");
                } else {
                    if (msg == "false") {
                        alert("提交失败。");
                    }
                }
            },
            error: function () {
                alert("提交失败");
            }
        });
    });
});



$(function () {
    $('#btReport').click(function () {
        var tbody = window.document.getElementById("tbody3");

        $.ajax({
            type: "post",
            dataType: "json",
            url: "",
            data: {
                postName: postName,
                userName: userName,
                time: time,
                reason: reason
            },
            success: function (msg) {
                if (msg.ret) {
                    var str = "";
                    var data = msg.data;

                    for (i in data) {
                        str += "<tr>" +
                        "<td>" + data[i].postName + "</td>" +
                        "<td>" + data[i].userName + "</td>" +
                        "<td>" + data[i].time + "</td>" +
                        "<td>" + data[i].reason + "</td>" +
                        "</tr>";
                    }
                    tbody.innerHTML = str;
                }
            },
            error: function () {
                alert("查询失败");
            }
        });
    });
});

function CheckedAll(obj) {
    var arr = $(":checkbox");
    for (var i = 0; i < arr.length; i++) {
        arr[i].checked = "checked";
    }
    obj.setAttribute("onclick", "CheckedNo('"+ obj +"')");
}

//全不选
function CheckedNo(obj) {
    var arr = $(":checkbox");
    for (var i = 0; i < arr.length; i++) {
        arr[i].checked = !arr[i].checked;
    }
    obj.setAttribute("onclick", "CheckedAll('" + obj + "')");
}

//反选
function CheckedRev() {
    var arr = $(":checkbox");
    for (var i = 0; i < arr.length; i++) {
        arr[i].checked = !arr[i].checked;
    }
}


function editBoard(rowId) {
    var row = document.getElementById(rowId).rowIndex;   //修改行所在表格中的位置
    var col = document.getElementById(rowId).cells;
    var text = col[2].innerHTML;
    col[2].innerHTML = "<input name='num" + row + "' style='width:40px;' type='text' value='" + text + "' />";
    col[3].lastChild.value = "确定";
    col[3].lastChild.setAttribute("onclick", "upBoard('" + rowId + "')");

}

function upBoard(rowId) {
    var row = document.getElementById(rowId).rowIndex;   //修改行所在表格中的位置
    var col = document.getElementById(rowId).cells;
    var text = col[2].firstChild.value;
    col[2].innerHTML = text;
    col[3].lastChild.value = "修改";
    col[3].lastChild.setAttribute("onclick", "editBoard('" + rowId + "')");
}

function addModerator() {
    var addTable = document.getElementById("searchModerator");
    var row_index = addTable.rows.length - 1;       //新插入行在表格中的位置
    var newRow = addTable.insertRow(row_index);  //插入新行
    newRow.id = "row" + row_index;                 //设置新插入行的ID

    var col1 = newRow.insertCell(0);
    col1.innerHTML = "<input type='text' name='moderatorID' id='moderatorID'/>";

    var col2 = newRow.insertCell(1);
    col2.innerHTML = "<input type='text' name='moderatorName' id='moderatorName'/>";

    var col3 = newRow.insertCell(2);
    col3.innerHTML = "<input id='edit" + row_index + "' type='button' value='修改' onclick=\"editModerator('row" + row_index + "')\" />";

}

function editModerator(rowId) {
    var row = document.getElementById(rowId).rowIndex;   //修改行所在表格中的位置
    var col = document.getElementById(rowId).cells;
    var text = col[0].innerHTML;
    col[0].innerHTML = "<input name='num" + row + "' style='width:40px;' type='text' value='" + text + "' />";
    col[1].lastChild.value = "确定";
    col[1].lastChild.setAttribute("onclick", "upModerator('" + rowId + "')");

}

function upModerator(rowId) {
    var row = document.getElementById(rowId).rowIndex;   //修改行所在表格中的位置
    var col = document.getElementById(rowId).cells;
    var text = col[1].firstChild.value;
    col[1].innerHTML = text;
    col[2].lastChild.value = "修改";
    col[2].lastChild.setAttribute("onclick", "editModerator('" + rowId + "')");
}
