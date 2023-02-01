function validarFecha(cadena){
    return !!cadena.match(/^.*(\d{2}\/\d{2}\/\d{4}).*$/);

}

function validarEmail(email){
    return !!email.match(/^[A-Za-z\.-]+\@[A-Za-z]+\.[a-z]{2,3}$/);

}

function escapeHTML(text) {
    return text
        .replaceAll('&', '&amp;')
        .replaceAll('<', '&lt;')
        .replaceAll('>', '&gt;')
        .replaceAll('"', '&quot;');
}

function inverseNameLastName(text){
    let arrayText = text.split(" ");
    let inversedText = "";
    for (let i = arrayText.length - 1; i >= 0; i--) {
        inversedText += arrayText[i];
        if (i == (arrayText.length - 1)) {
            inversedText += ",";
        }
    }
    return inversedText;
}

function eraseDangerousTags(str){
    let regex = /(\<script\>.+\<\/script\>)/;
    if (str.match(regex)) {
        return str.replace(regex, "")
    }
}

