function typed(){
    const maxLength = 80;
    let numChar = document.getElementById("numChar");
    window.addEventListener("keydown", function (evt) {
        let texto = document.getElementById("texto");
        if (evt.key === "Backspace" || evt.key === "Delete") {
                    numChar.innerHTML = "Aun puedes escribir " + (maxLength - texto.value.length) + " caracteres";
        }else if (evt.key === "ArrowLeft" || evt.key === "ArrowRight"){
            //Do Nothing
        }
        else {
            numChar.innerHTML = "Aun puedes escribir " + (maxLength - texto.value.length) + " caracteres";
        }
    });
}