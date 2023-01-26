function verficarTodo() {
    verif1(document.getElementById("i1").value);
    verif2(document.getElementById("i2").value);
    verif3(document.getElementById("i3").value);
    verif4(document.getElementById("i4").value);
    verif5(document.getElementById("i5").value);
    verif6(document.getElementById("i6").value);
    verif7(document.getElementById("i7").value);
    verif8(document.getElementById("i8").value);
    verif9(document.getElementById("i9").value);
    verif10(document.getElementById("i10").value);
    verif11(document.getElementById("i11").value);
    verif12(document.getElementById("i12").value);
    verif13(document.getElementById("i13").value);
    verif14(document.getElementById("i14").value);
    verif15(document.getElementById("i15").value);
    verif16(document.getElementById("i16").value);
    verif17(document.getElementById("i17").value);
}

function verif1(texto){
    if (texto.match(/^[0-9]+$/)){
        document.getElementById("e1").innerHTML = "Cadena correcta";
        document.getElementById("e1").style.color = "#008000"
    } else {
        document.getElementById("e1").innerHTML = "Cadena incorrecta";
        document.getElementById("e1").style.color = "#FF0000"
    }
}

function verif2(texto){
    if (texto.match(/^[a-zA-Z\u00C0-\u017F]+$/)) {
        document.getElementById("e2").innerHTML = "Cadena correcta";
        document.getElementById("e2").style.color = "#008000"
    } else {
        document.getElementById("e2").innerHTML = "Cadena incorrecta";
        document.getElementById("e2").style.color = "#FF0000"
    }
}
function verif3(texto){
    if (texto.match(/^[a-zA-Z\u00C0-\u017F\s]+$/)){
        document.getElementById("e3").innerHTML = "Cadena correcta";
        document.getElementById("e3").style.color = "#008000"
    } else {
        document.getElementById("e3").innerHTML = "Cadena incorrecta";
        document.getElementById("e3").style.color = "#FF0000"
    }
}
function verif4(texto){
    if (texto.match(/^[a-zA-Z\u00C0-\u017F\s'\-]+$/)){
        document.getElementById("e4").innerHTML = "Cadena correcta";
        document.getElementById("e4").style.color = "#008000"
    } else {
        document.getElementById("e4").innerHTML = "Cadena incorrecta";
        document.getElementById("e4").style.color = "#FF0000"
    }
}
function verif5(texto){
    if (texto.match(/^\d\.[0-9]{2}$/)){
        document.getElementById("e5").innerHTML = "Cadena correcta";
        document.getElementById("e5").style.color = "#008000"
    } else {
        document.getElementById("e5").innerHTML = "Cadena incorrecta";
        document.getElementById("e5").style.color = "#FF0000"
    }
}
function verif6(texto){
    if (texto.match(/^\d+\.?[0-9]*$/)){
        document.getElementById("e6").innerHTML = "Cadena correcta";
        document.getElementById("e6").style.color = "#008000"
    } else {
        document.getElementById("e6").innerHTML = "Cadena incorrecta";
        document.getElementById("e6").style.color = "#FF0000"
    }
}

function verif7(texto){
    if (texto.match(/^-?\d*(\.\d+)?$/)){
        document.getElementById("e7").innerHTML = "Cadena correcta";
        document.getElementById("e7").style.color = "#008000"
    } else {
        document.getElementById("e7").innerHTML = "Cadena incorrecta";
        document.getElementById("e7").style.color = "#FF0000"
    }
}

function verif8(texto){
    if (texto.match(/^(?!0+\.00)(?=.{1,9}(\.|$))(?!0(?!\.))\d{1,3}(,\d{3})*(\.\d+)?$/)){
        document.getElementById("e8").innerHTML = "Cadena correcta";
        document.getElementById("e8").style.color = "#008000"
    } else {
        document.getElementById("e8").innerHTML = "Cadena incorrecta";
        document.getElementById("e8").style.color = "#FF0000"
    }
}

function verif9(texto){
    if (texto.match(/^(?:(?:(?:0?[1-9]|1\d|2[0-8])[/](?:0?[1-9]|1[0-2])|(?:29|30)[/](?:0?[13-9]|1[0-2])|31[/](?:0?[13578]|1[02]))[/](?:0{2,3}[1-9]|0{1,2}[1-9]\d|0?[1-9]\d{2}|[1-9]\d{3})|29[/]0?2[/](?:\d{1,2}(?:0[48]|[2468][048]|[13579][26])|(?:0?[48]|[13579][26]|[2468][048])00))$/)){
        document.getElementById("e9").innerHTML = "Cadena correcta";
        document.getElementById("e9").style.color = "#008000"
    } else {
        document.getElementById("e9").innerHTML = "Cadena incorrecta";
        document.getElementById("e9").style.color = "#FF0000"
    }
}

function verif10(texto){
    if (texto.match(/((1[0-2]|0?[1-2]):([0-5][0-9]) ?([AaPp][Mm]))/)){
        document.getElementById("e10").innerHTML = "Cadena correcta";
        document.getElementById("e10").style.color = "#008000"
    } else {
        document.getElementById("e10").innerHTML = "Cadena incorrecta";
        document.getElementById("e10").style.color = "#FF0000"
    }
}

function verif11(texto){
    if (texto.match(/^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$/)){
        document.getElementById("e11").innerHTML = "Cadena correcta";
        document.getElementById("e11").style.color = "#008000"
    } else {
        document.getElementById("e11").innerHTML = "Cadena incorrecta";
        document.getElementById("e11").style.color = "#FF0000"
    }
}

function verif12(texto){
    if (texto.match(/(?=(.*[0-9]))(?=.*[\!@#$%^&*()\\[\]{}\-_+=|:;"'<>,./?])(?=.*[a-z])(?=(.*[A-Z]))(?=(.*)).{8,}/)){
        document.getElementById("e12").innerHTML = "Cadena correcta";
        document.getElementById("e12").style.color = "#008000"
    } else {
        document.getElementById("e12").innerHTML = "Cadena incorrecta";
        document.getElementById("e12").style.color = "#FF0000"
    }
}

function verif13(texto){
    if (texto.match(/^[a-z0-9_-]{3,16}$/)){
        document.getElementById("e13").innerHTML = "Cadena correcta";
        document.getElementById("e13").style.color = "#008000"
    } else {
        document.getElementById("e13").innerHTML = "Cadena incorrecta";
        document.getElementById("e13").style.color = "#FF0000"
    }
}

function verif14(texto){
    if (texto.match(/^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/)){
        document.getElementById("e14").innerHTML = "Cadena correcta";
        document.getElementById("e14").style.color = "#008000"
    } else {
        document.getElementById("e14").innerHTML = "Cadena incorrecta";
        document.getElementById("e14").style.color = "#FF0000"
    }
}

function verif15(texto){
    if (texto.match(/^(?:([A-Za-z]+):)?(\/{0,3})([0-9.\-A-Za-z]+)(?::(\d+))?(?:\/([^?#]*))?(?:\?([^#]*))?(?:#(.*))?$/)){
        document.getElementById("e15").innerHTML = "Cadena correcta";
        document.getElementById("e15").style.color = "#008000"
    } else {
        document.getElementById("e15").innerHTML = "Cadena incorrecta";
        document.getElementById("e15").style.color = "#FF0000"
    }
}
function verif16(texto){
    if (texto.match(/^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$/)){
        document.getElementById("e16").innerHTML = "Cadena correcta";
        document.getElementById("e16").style.color = "#008000"
    } else {
        document.getElementById("e16").innerHTML = "Cadena incorrecta";
        document.getElementById("e16").style.color = "#FF0000"
    }
}
function verif17(texto){
    if (texto.match(/^#?([a-f0-9]{6}|[a-f0-9]{3})$/)){
        document.getElementById("e17").innerHTML = "Cadena correcta";
        document.getElementById("e17").style.color = "#008000"
    } else {
        document.getElementById("e17").innerHTML = "Cadena incorrecta";
        document.getElementById("e17").style.color = "#FF0000"
    }
}