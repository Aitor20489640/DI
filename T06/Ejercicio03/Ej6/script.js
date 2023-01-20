function parOImpar() {
        if (document.getElementById("entero").value % 2 === 0){
            document.getElementById("resultado").innerHTML = "Es par";
        } else {
            document.getElementById("resultado").innerHTML = "Es impar";
        }
}