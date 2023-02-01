function occultOrShow(id) {
    var p = document.getElementById('p'+id);
    var link = document.getElementById('a'+id);

    if(p.style.display == "" || p.style.display == "block") {
        p.style.display = "none";
        link.innerHTML = 'Mostrar contenidos';
    }
    else {
        p.style.display = "block";
        link.innerHTML = 'Ocultar contenidos';
    }
}