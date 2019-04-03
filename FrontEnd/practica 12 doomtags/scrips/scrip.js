var txt = document.getElementById("txt").innerHTML;

window.onload=function(){
    var btn=0
    btn=document.getElementById("btn");
    btn.addEventListener("click",mifuncion);
    document.getElementById("btn2").addEventListener("click",deletes);
    document.getElementById("btn3").addEventListener("click",crojo);
    document.getElementById("btn4").addEventListener("click",regen);
}
function mifuncion() {
    console.log("123 1");
}
function deletes(){
    document.getElementById("txt").innerHTML = "";
}
function crojo(params) {
 document.getElementById("txt").style.backgroundColor ="red";   
}
function regen(){
    document.getElementById("txt").innerHTML = txt;
}