var Frase = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam iaculis mauris enim, quis fermentum nisi sodales vel. Donec dignissim accumsan leo. Mauris pellentesque rutrum magna vitae laoreet. Aliquam erat volutpat. Maecenas scelerisque malesuada dolor, in sagittis nulla dapibus vel. Mauris lacinia congue est convallis vulputate. Phasellus et risus molestie, mattis nisl at, congue neque. Donec et erat nulla. Donec tristique leo mauris, nec elementum sem volutpat non. Vivamus tempor, arcu eu varius hendrerit, turpis sapien hendrerit arcu, eget sollicitudin mi erat rutrum nulla. Praesent elementum ante quam, ac pellentesque ex elementum quis. Aliquam at nulla sit amet ex dictum scelerisque eget sit amet ipsum. Donec eleifend, diam ut facilisis porttitor, mauris metus consequat lorem, ultricies gravida erat erat ut tortor. In non nisl eget mi finibus facilisis sit amet a lacus.";

console.log(Frase);

Frase = upper(Frase);

console.log(Frase);

simbolos(Frase);

vocal(Frase);
function upper(Frase) {
    FraseFinal = new String();
    for (let index = 0; index <= Frase.length; index++) {
    
            FraseFinal = FraseFinal + Frase.charAt(index).toUpperCase();;
          
    }
    return (FraseFinal);
}
function UpperOnlyFirst(Frase) {
    FraseFinal = new String();
    for (let index = 0; index <= Frase.length; index++) {
        if (Frase.charAt(index) == ' ') {
            FraseFinal = FraseFinal + Frase.charAt(index);
            FraseFinal = FraseFinal + Frase.charAt(index + 1).toUpperCase();
            index++;
        } else if (index == 0) {
            FraseFinal = Frase.charAt(index).toUpperCase();
        } else {
            FraseFinal = FraseFinal + Frase.charAt(index);
        }
    }
    return (FraseFinal);
}

function vocal(Frase) {
    var a = 0, e = 0, i = 0, o = 0, u = 0;
    for (let index = 0; index <= Frase.length; index++) {
        if (Frase.charAt(index).toLowerCase() == 'a') a++;
        else if (Frase.charAt(index).toLowerCase() == 'e') e++;
        else if (Frase.charAt(index).toLowerCase() == 'i') i++;
        else if (Frase.charAt(index).toLowerCase() == 'o') o++;
        else if (Frase.charAt(index).toLowerCase() == 'u') u++;
    }
    console.log("A = " + a + " E = " + e + " I = " + i + " O = " + o + " U = " + u);
}

function simbolos(Frase) {
    var point = 0, dpoint = 0, dcome = 0, come = 0;
    for (let index = 0; index <= Frase.length; index++) {
        if (Frase.charAt(index) == '.') point++;
        else if (Frase.charAt(index) == ';') dpoint++;
        else if (Frase.charAt(index) == ':') dcome++;
        else if (Frase.charAt(index) == ',') come++;
    }
    console.log(": = " + dpoint + " ; = " + dcome + " . = " + point + " , = " + come);
}