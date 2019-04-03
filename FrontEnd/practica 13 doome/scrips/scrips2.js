$(() => {
    document.getElementById("btnNum").addEventListener("click", tablas);
    document.getElementById("btnFc").addEventListener("click", fact);
    document.getElementById("btnPr").addEventListener("click", isprimo);
    document.getElementById("btnAl").addEventListener("click", tablasAleatorios);

});
function tablas() {
    let nums = parseInt(document.getElementById("tableNum").value);
    var tabla = '<table class="table">'
    for (let i = 1; i <= parseInt(document.getElementById("tableCat").value); i++) {
        tabla += '<tr><td>' + nums + '</td>';
        tabla += '<td>x</td>';
        tabla += '<td>' + i + '</td>';
        tabla += '<td> = </td>';
        tabla += '<td>' + (nums * i) + '</td></tr>';
    }
    tabla += '</table>';
    document.getElementById('tablas').innerHTML = tabla;

}
function tablasAleatorios() {
    let nums = parseInt(document.getElementById("tableAl").value);
    let rango = parseInt(document.getElementById("tableRng").value);
    var tabla = '<table class="table">'
    for (let i = 1; i <= nums; i++) {
        tabla += '<tr><td>' + Math.round((Math.random() * rango) + 1) + '</td></tr>';
    }
    tabla += '</table>';
    document.getElementById('tablaAl').innerHTML = tabla;
}

function isprimo(){
    var num =parseInt(document.getElementById("primo").value);
    for(var i=num-1;i>1;i--){
        if(num%i==0){
            alert("No es Primo")
        }
    }
    alert("es Primo")
}
function fact() {
    var cat =parseInt(document.getElementById("factorial").value);
    var facts=1;
    for(var i=1;i<=cat;i++){
        facts=i*facts;
    }
    alert("Factorial de " +cat+" = "+facts);
}