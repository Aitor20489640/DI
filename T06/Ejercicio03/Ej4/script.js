function verificarDni() {
    let letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
    let dniNumbers = document.getElementById("dniNumber").value;
    let dniLetter = document.getElementById("dniLetter").value;
    let numeroCorrecto = dniNumbers <= 99999999 && dniNumbers >= 0;
    if (numeroCorrecto) {
        let resultado = (letras[dniNumbers % 23]) === dniLetter;
        if (resultado) {
            document.getElementById("resultado").innerHTML = "El número y la letra de DNI son correctos.";
        } else {
            document.getElementById("resultado").innerHTML = "La letra que ha indicado no es correcta.";
        }
    } else {
        document.getElementById("resultado").innerHTML = "El número proporcionado no es válido";
    }
}