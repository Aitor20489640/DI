function calcularFactorial() {
    let entero = document.getElementById("entero").value;
    let resultado = 1;

    if (entero <= 1){
        document.getElementById("resultado").innerHTML = "El resultado del factorial de " + entero + " es 1";
    } else {
        for (let i = entero; i > 1; i--) {
            resultado *= i;
        }
        document.getElementById("resultado").innerHTML = "El resultado del factorial de " + entero + " es " + resultado;
    }
}