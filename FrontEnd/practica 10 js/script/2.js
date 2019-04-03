/*console.log(holamundo());
mensajito("hola");
var num1= parseInt(prompt("num 1"));
var num2= parseInt(prompt("num 2"));
var num3= parseInt(prompt("primos"));
console.log(isprimo(num3));
console.log(suma(num1,num2));
function holamundo(){
    return "holamundo";
}
function mensajito(mensaje) {
    console.log(mensaje);
}
function suma(num1,num2){
    return num1+num2;
} 
function isprimo(num){
    var isprimo=true;
    for(var i=num-1;i>1;i--){
        if(num%i==0){
            isprimo=false;
            return isprimo;
        }
    }
    return isprimo;
}*/
/*var cantidad=parseInt(prompt("cantidad de numeros en el arreglo"));
var array=[];
for (let index = 0; index < cantidad; index++) {
    array[index]= Math.round((Math.random() * 100) + 1);;
    
}
pares(array);
inpares(array);
function pares(array) {
    let cat=0;
    for (let index = 0; index < array.length-1; index++) {
        if (array[index]%2==0) {
            cat++;
            console.log(array[index]);
        }
    }    
    console.log("Total de inpares "+cat);
}

function inpares(array) {
    let cat=0;
    for (let index = 0; index < array.length-1; index++) {
        if (array[index]%2!=0) {
            cat++;
            console.log(array[index]);
        }
    }    
    console.log("Total de inpares "+cat);
}*/
var cat=6;
triangulo(cat);
function fact(cat) {
    var facts=1;
    for(var i=1;i<=cat;i++){
        facts=i*facts;
    }
    return facts;
}

function fibonaci(cat){
var fibo=1;
var pibote=1;
for(var i=2;i<cat;i++){

    fibo=fibo+pibote;
    pibote=fibo-pibote;
}
console.log(fibo);
}
function triangulo(cat){
    let c=0;
    for(let m=0;m<=cat;m++){
        for(let n=0;n<=m;n++){
            c=fact(m)/(fact(n)*fact((m-n)));
            console.log(c);
        }
    }
}