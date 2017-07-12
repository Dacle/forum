$(document).ready(function () {
    var objStr = "div.menu";
    $(objStr).each(function (i) {

        $(this).click(function () {
            $($(objStr + " dd")[i]).show();
            $($(objStr + " dt")[i]).addClass(".pull");
        });

        $(this).hover(function () { }, function () {
            $($(objStr + " dd")[i]).hide();
            $($(objStr + " dt")[i]).removeClass(".pull");
        });
    });
});