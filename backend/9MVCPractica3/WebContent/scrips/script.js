window.onload = function (){
    var miparrafo = document.getElementById("plorem");
    miparrafo.addEventListener("click",mandarFormulario);
}
function mandarFormulario(){
    var miFormulario = document.forms("formsuma");
    miFormulario.submit();
}