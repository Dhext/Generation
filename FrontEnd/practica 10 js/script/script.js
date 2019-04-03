var opc;
alert("1--- suma\n2--dias de la semana");
opc = parseInt(prompt("Opcion"));
switch (opc) {
    case 1:
        var num1 = 0, num2 = 0, sum = 0;
        do {
            num1 = parseInt(prompt("dame un numero 1"));
            num2 = parseInt(prompt("dame un numero 2"));
            sum = num1 + num2;
            if (isNaN(sum)) {
                alert("error");
            }
        } while (isNaN(sum));
        alert(sum);
        break;
    case 2:
        var dia = 0;
        do {
            dia = parseInt(prompt("Ingresa el dumero del dia"));
            switch (dia) {
                case 1:
                    alert("Lunes");
                    break;
                case 2:
                    alert("Martes");
                    break;
                case 3:
                    alert("Miercoles");
                    break;
                case 4:
                    alert("Jueves")
                    break;
                case 5:
                    alert("Viernes");
                    break;
                case 6:
                    alert("Sabado");
                    break;
                case 7:
                    alert("Domingo")
                    break;
                default:
                    alert("Error")
                    break;
            }
        } while (dia >= 8);
        break;
    case 3:
        var array = [12, 16, 2.2, "hpl", 'ss'];
        for (var i = 0; i <= array.length - 1; i++) {
            console.log(array[i]);
        }
        break;
    default:
        break;
}


