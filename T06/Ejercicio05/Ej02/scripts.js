function main() {
    let cadena = document.getElementById("cadena").value;
    let result = palindrome(cadena);
    if (result === true) {
        document.getElementById("resultado").innerHTML = "Es palíndromo"
    } else {
        document.getElementById("resultado").innerHTML = "No es palíndromo"
    }
}

function palindrome(cadena) {
    // Paso 1. Pon en minuscula la cadena y usa el RexEXP para remover los caracteres no deseados en el.
    let re = /[\W_]/g;
    // Paso 2. Utiliza los métodos de encadenamiento con funciones integradas.
    let lowRegStr = cadena.toLowerCase().replace(re, '');
    let reverseStr = lowRegStr.split('').reverse().join('');
    //  Paso 3. Revisa si reverseStr es estrictamente igual a lorRegStr y regresa un BooLean
    return reverseStr === lowRegStr;
}