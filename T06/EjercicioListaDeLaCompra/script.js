$("document").ready(function () {
    getCookiesAndAppendLi();
    $("form input:button").click(function () { // Evento Clic para el botón de añadir
        let text = $("#anadir").val();
        if (text.match(/^.+$/)) {
            let cookieID = "item" + localStorage.length; // Id para el elemento en la lista el cual también es el nombre de la cookie
            let item = "<li id='" +cookieID + "'>" + text + " - " + new Date().toLocaleString() + "</li>"; // Item para la lista de la compra
            $("#listaCompra").append($(item));
            $("li").dblclick(function (){ // Evento Doble clic para cada item de la lista se pueda eliminar al hacer doble click en el elemento
                localStorage.removeItem($(this).attr("id")); // Elimina la cookie correspondiente con el item de la lista
                $(this).remove();
            });
            localStorage.setItem(cookieID, item); // Añade el item al documento de las cookies
        }
    });

    /**
     * Botón para limpiar las cookies de la lista de la compra
     */
    $("#resetCookies").click(function () {
        localStorage.clear();
    })

    /**
     * Función para conseguir las cookies de la lista y añadirlas a la lista
     */
    function getCookiesAndAppendLi() {
        for (let i = 0; i < localStorage.length; i++) {
            $("#listaCompra").append(localStorage.getItem("item" + i));
            $("li").dblclick(function (){
                localStorage.removeItem($(this).attr("id"));
                $(this).remove();
            });
        }
    }
});

function setup() {
    noCanvas()
    frameRate(1)

    let html = `
            <circle 
                cx="150" 
                cy="150" 
                r="5" 
                stroke="transparent" 
                fill="black" 
            />
            `
    for (let i = 0; i < 60; i++) {
        html += `
                <circle 
                    cx="${(130 * cos(2 * PI * i / 60)) + 150}" 
                    cy="${(130 * sin(2 * PI * i / 60)) + 150}" 
                    r="${i % 15 == 0 ? 4 : i % 5 === 0 ? 2 : 1}" 
                    stroke="transparent" 
                    fill="rgba(0,0,0,0.5)" 
                    stroke-width="1"
                />`
    }
    select("#dots").html(html)
}

function draw() {
    let sec_angle = 360 * second() / 60
    let min_angle = 360 * minute() / 60
    let hour_angle = 360 * (hour() % 12) / 12

    select("#second-clock-hand").style("transform", `rotate(${sec_angle}deg)`)
    select("#minute-clock-hand").style("transform", `rotate(${min_angle}deg)`)
    select("#hour-clock-hand").style("transform", `rotate(${hour_angle}deg)`)
}