function switchTag(tag,content)
{
    for(i=1; i < 7; i++)
    {
        if ("tag"+i==tag)/*找到对应的样式*/
        {
            document.getElementById(tag).getElementsByTagName("a")[0].className="selectli";
            document.getElementById(tag).getElementsByTagName("a")[0].getElementsByTagName("span")
            [0].className="selectspan";
        }else{
            document.getElementById("tag"+i).getElementsByTagName("a")[0].className="";
            document.getElementById("tag"+i).getElementsByTagName("a")[0].getElementsByTagName("span")
            [0].className="";
        }
        if ("content"+i==content)
        {
            document.getElementById(content).className="";
        }else{
            document.getElementById("content"+i).className="hidecontent";
        }
        document.getElementById("content").className=content;
    }
}
