function verificarDni() {
    let letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
    let dniNumbers = document.getElementById("dniNumber").value;
    let dniLetter = document.getElementById("dniLetter").value;

    let resultado = (letras[dniNumbers % 23]) === dniLetter;
}