//jugador 
var player = 0;
//turno actual
var turn = 0;
window.onload = () => {

    //evento re-roll 
    //Al tomor elementos por su nombre de clase el doom toma un array de 
    //los elementos, al colocar [0] selecciona solo la primera aparicion
    document.getElementsByClassName("btn-roll")[0].addEventListener("click", start);
    //evento new game
    document.getElementsByClassName("btn-new")[0].addEventListener("click", new_game);
    //evento hold
    document.getElementsByClassName("btn-hold")[0].addEventListener("click", hold);
}
//Reset de Contadores a 0
function new_game() {
    //reset de la puntuacion total 
    document.getElementById("score-0").innerHTML = "0";
    document.getElementById("score-1").innerHTML = "0";
    //reset de la puntuacion temporal
    document.getElementById("current-0").innerHTML = "0";
    document.getElementById("current-1").innerHTML = "0";
    //reset al Jugador
    player = 0;
    turno();
    //reset al turno actual
    turn = 0;
}
//define a quien el turno correspondiente
function turno() {
    if (player == 0) {
        // la funion remove quita la clase especificada  
        document.getElementsByClassName("player-1-panel")[0].classList.remove("active");
        //la funcion add añade la clase que le especifiques
        document.getElementsByClassName("player-0-panel")[0].classList.add("active");
    } else {
        document.getElementsByClassName("player-1-panel")[0].classList.add("active");
        document.getElementsByClassName("player-0-panel")[0].classList.remove("active");
    }
    //aumenta 1 al contador de turnos globales
    turn = turn + 1;
}
//funcion que se encarga del roll de dados y el conteo en el current
function start() {
    // si se cumplen 30 turnos 15 cada jugador se decide el ganador
    if (turn == 30) {
        //toma la puntuacion de ambos y la compara
        var puntuacion0 = parseInt(document.getElementById("score-0").innerHTML);
        var puntuacion1 = parseInt(document.getElementById("score-1").innerHTML);
        if (puntuacion0 > puntuacion1) {
            alert("Gano Jugador 1");
            //reset al juego
            new_game();
        } else {
            alert("Gano Jugador 2");
            new_game();
        }
    } else {
        //verifica a que jugador le toca el roll
        if (player == 0) {
            //toma el valor del dado mandado por la funcion
            var dado = dice();
            //si el valor no es uno se ejecuta
            if (dado != 1) {
                //toma el valor del current actual 
                var temp = parseInt(document.getElementById("current-0").innerHTML);
                //coloca la suma del current actual mas el valor del dado
                document.getElementById("current-0").innerHTML = temp + dado;
            } else {
                //si el valor es 0 elimina el current y cambia el turno
                document.getElementById("current-0").innerHTML = "0";
                player = 1;
                turno();
            }
        } else {
            var dado = dice();
            if (dado != 1) {
                var temp = parseInt(document.getElementById("current-1").innerHTML);
                document.getElementById("current-1").innerHTML = temp + dado;
            } else {
                document.getElementById("current-1").innerHTML = "0";
                player = 0;
                turno();
            }

        }
    }

}
function hold() {
    // toma los current de ambos jugadores 
    var temp1 = parseInt(document.getElementById("current-1").innerHTML);
    var temp = parseInt(document.getElementById("current-0").innerHTML);
    //compara si son iguales a 0 de ser asi manda una alerta 
    if (temp1 == 0 && temp == 0) {
        alert("No Pudes Pasar Turno");
    } else {
        //al no ser 0 verifica el turno del jugador
        if (player == 0) {
            //toma la puntuacion actual
            var puntuacion = parseInt(document.getElementById("score-0").innerHTML);
            // coloca la puntuacion actual y la suma al current 
            document.getElementById("score-0").innerHTML = temp + puntuacion;
            //coloca en 0 el current
            document.getElementById("current-0").innerHTML = "0";
            //cambia el turno
            player = 1;
            turno();
        } else {

            var puntuacion = parseInt(document.getElementById("score-1").innerHTML);
            document.getElementById("score-1").innerHTML = temp1 + puntuacion;
            document.getElementById("current-1").innerHTML = "0";
            player = 0;
            turno();
        }
    }

}
//roll de dados
function dice() {
    //Genera un numero aleatorio, en base a este numero selecciona la img del dado que colocara
    var dado = Math.floor((Math.random() * 6) + 1);
    //dependiendo del numero generado selecciona el dado
    switch (dado) {
        case 1:
            document.getElementById('dice').src = "img/dice-1.png";
            // alerta que pierdes puntos
            alert("Pierdes Puntos");
            //retorna el valor del dado
            return dado;
        case 2:
            document.getElementById('dice').src = "img/dice-2.png";
            return dado;
        case 3:
            document.getElementById('dice').src = "img/dice-3.png";
            return dado;
        case 4:
            document.getElementById('dice').src = "img/dice-4.png";
            return dado;
        case 5:
            document.getElementById('dice').src = "img/dice-5.png";
            return dado;
        case 6:
            document.getElementById('dice').src = "img/dice-6.png";
            return dado;
        default:
            //solo si existe un error
            alert("error " + dado);
            break;
    }
}