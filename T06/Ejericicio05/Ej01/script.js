function main(){
    let cadena = document.getElementById("cadena").value;

    if (cadena === "") {
        document.getElementById("resultado").innerHTML = "Esta vacio";
    } else {
        if (cadena.match(/^[A-Z]+$/)){
            document.getElementById("resultado").innerHTML = "Esta formado solo por mayúsculas";
        }
        else if (cadena.match(/^[a-z]+$/)) {
            document.getElementById("resultado").innerHTML = "Esta formado solo por minúsculas";
        } else {
            document.getElementById("resultado").innerHTML = "Esta formado por una mezcla de mayúsculas y minúsculas";
        }
    }
}