function muestraInformacion(){
    window.addEventListener("mousemove", function (evt) {
        let mouseBox = document.getElementById("raton");
        mouseBox.children[1].innerHTML = "Navegador [" + evt.screenX + ", " + evt.screenY + "]" + "<br>" + "Pagina [" + evt.pageX + ", " + evt.pageY + "]";
        mouseBox.style.backgroundColor = "#ffffff";
        let keyBox = document.getElementById("teclado");
        keyBox.style.backgroundColor = "#ffffff";

    });
    window.addEventListener("keydown", function (evt) {
        let keyBox = document.getElementById("teclado");
        keyBox.children[1].innerHTML = "Carácter [" + evt.key +"]" + "<br>" + "Código [" + evt.key.charCodeAt(0) +"]"
        keyBox.style.backgroundColor = "#CCE6FF";
    })
    window.addEventListener("mousedown", function () {
        let mouseBox = document.getElementById("raton");
        mouseBox.style.backgroundColor = "#FFFFCC";
    });
}
