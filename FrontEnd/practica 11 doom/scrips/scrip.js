/*window.onload = main();

function main() {
    alert("testo");
}

window.onload = function () {
    
}
//funcion flecha
window.onload= () => {
    alert("hola");
}
$(function(){
    alert("dasd");
});


$(() =>
{
    alert("dasd");
}
);*/
$(()=>{ 
    var btnmatar = document.getElementById("btn");
    btnmatar.onclick=mensajemater;
    document.getElementById("divparrafo").ondblclick = msj;

});
function mensajemater() {
    console.log("hola")
}
function msj() {
    alert("");
}