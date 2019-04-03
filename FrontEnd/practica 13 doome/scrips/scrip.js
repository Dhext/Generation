var bn = true, bam = true;
window.onload = function () {
    InicioForms();
    document.getElementById("btnMsg").addEventListener("click", mostrarMensaje);
    document.getElementById("btnSum").addEventListener("click", mostrarSuma);
    document.getElementById("btnName").addEventListener("click", name);
    document.getElementById("txtnom").addEventListener("focusin", change);
    document.getElementById("txtamater").addEventListener("focusin", change2);
    document.getElementById("txtapater").addEventListener("focusin", change3);
    document.getElementById("txtnom").addEventListener("focusout", change_1);
    document.getElementById("txtamater").addEventListener("focusout", change_2);
    document.getElementById("txtapater").addEventListener("focusout", change_3);
}
function mostrarMensaje() {
    var msg = document.getElementById("txtmsg").value;
    alert(msg);
}
function mostrarSuma() {
    var num1 = parseInt(document.getElementById("numero1").value);
    var num2 = parseInt(document.getElementById("numero2").value);
    alert(num1 + num2);
}
function name() {
    var name = document.getElementById("txtnom").value;
    var amater = document.getElementById("txtamater").value;
    var apater = document.getElementById("txtapater").value;
    alert(name+" "+amater+" "+apater);
}
function change() {
    
        document.getElementById("txtnom").style.backgroundColor = "Green";   
        if(document.getElementById("txtamater").value === ""){
            document.getElementById("txtamater").style.backgroundColor = "Red";
        }
        if(document.getElementById("txtapater").value === ""){
            document.getElementById("txtapater").style.backgroundColor = "Red";
        }
}
function change2() {
    
    document.getElementById("txtamater").style.backgroundColor = "Green";   
    if(document.getElementById("txtnom").value === ""){
        document.getElementById("txtnom").style.backgroundColor = "Red";
    }
    if(document.getElementById("txtapater").value === ""){
        document.getElementById("txtapater").style.backgroundColor = "Red";
    }
}
function change3() {
    
    document.getElementById("txtapater").style.backgroundColor = "Green";   
    if(document.getElementById("txtnom").value === ""){
        document.getElementById("txtnom").style.backgroundColor = "Red";
    }
    if(document.getElementById("txtamater").value === ""){
        document.getElementById("txtamater").style.backgroundColor = "Red";
    }
}
function change_1() {  
    if(document.getElementById("txtnom").value === ""){
        document.getElementById("txtnom").style.backgroundColor = "Red";
    }
}
function change_2() {  
    if(document.getElementById("txtamater").value === ""){
        document.getElementById("txtamater").style.backgroundColor = "Red";
    }
}
function change_3() {  
    if(document.getElementById("txtapater").value === ""){
        document.getElementById("txtapater").style.backgroundColor = "Red";
    }
}
function InicioForms() {
    document.getElementById("txtnom").style.backgroundColor = "Red";
    document.getElementById("txtamater").style.backgroundColor = "Red";
    document.getElementById("txtapater").style.backgroundColor = "Red";
}