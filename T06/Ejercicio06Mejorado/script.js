
let defaultFrases = ["tendrás un día de alegrías y buenos momentos, disfrútalos como nunca.", "tendrás un día de alegrías y buenos momentos, disfrútalos como nunca.",
    "concéntrate en lo que quieres lograr y ganaras. No lo olvides.", "el cielo sera tu limite, pues grandes acontecimientos te sucederán.",
    "te sentirás feliz como un niño y veras al mundo con sus ojos.", "vivirás tu vejez con comodidades y riquezas materiales.",
    "confía en tu suerte, que es mucha y te rodeara de prosperidad.", "no todo el mundo puede recibir las mismas cosas. Se practico.",
    "te aguarda una larga y feliz vida.", "muy pronto seras incluido en muchas reuniones, fiestas y tertulias.",
    "cuando busques lo que mas deseas, recuerda hacer tu mejor esfuerzo.", "tienes por delante un maravilloso día para triunfar; disfrútalo y compártelo.",
    "hoy seras reconocido por tus dones especiales y lograras ser feliz por muchas horas.", "tu corazón estallara de alegría con la llegada de buenas noticias.",
    "seras promovido en tu trabajo debido a tus logros y capacidades."];
let frases = [];
let person;
let maxRandom = 0;
let arrayInicio = [];
let arrayFin = [];

const cargarSonido = function (fuente) {
    const sonido = document.createElement("audio");
    sonido.src = fuente;
    sonido.setAttribute("preload", "auto");
    sonido.setAttribute("controls", "none");
    sonido.style.display = "none"; // <-- oculto
    document.body.appendChild(sonido);
    return sonido;
};

async function predecirFuturo() {
    maxRandom = frases.length;
    let random = Math.floor(Math.random() * maxRandom);
    const sonido = cargarSonido("dystopian-future.mp3");
    person = localStorage.getItem("person");
    if (person == null) {
        person= window.prompt("Indica tu nombre");
    }
    if (person == null || person == "") {// Se comprueba si el nombre indicado esta vacio y se asigna un nombre por defecto.
        person = "Usuario";
    }
    sessionStorage.setItem("person", person);
    $("#futuro").text("Consultando a los espíritus…");
    sonido.play();
    await new Promise(resolve => setTimeout(resolve, 3000)); // Se espera un segundo a dar la respuesta a para darle un carácter misterioso.
    $("#futuro").text(person + ", " + frases[random]);
    arrayInicio = frases.slice(0, random);
    arrayFin = frases.slice(random + 1, frases.length);
    frases = arrayInicio.concat(arrayFin);
    maxRandom--;
    sonido.pause();
    sonido.currentTime = 0;

    if (frases.length === 0) {
        if (localStorage.getItem("person") !== null) {
            for (let i = 0; i < localStorage.length - 1; i++) {
                frases.push(localStorage.getItem(("frase" + i)));
            }
            maxRandom = localStorage.length - 1;
        } else {
            maxRandom = localStorage.length;
        }
    }
}

function addFrases() {
    let frase = document.getElementById("addFrase").value;

    if (frase !== "") {// Se comprueba si la frase no esta vacia
        if (frase.match(/^[A-Za-z,.]+\s+[A-Za-z,.\s]+$/)){ // Se comprueba si la frase tiene letras
            localStorage.setItem(("frase" + maxRandom), frase);
            frases.push(frase); // Se añade la frase al array
            maxRandom++;
        } else {
            alert("La frase debe contener caracteres");
        }
    } else {
        alert("La frase no puede estar vacia");

    }
}

$("document").ready(function () {
    $("#cc").click(function () {
        let textoCookies = localStorage.getItem("frases");
        alert(textoCookies);
    });
    $("#clearCookies").click(function () {
        localStorage.clear();
    });

    if (localStorage.getItem("person") !== null) {
        for (let i = 0; i < defaultFrases.length; i++) {
            localStorage.setItem(("frase" + i), defaultFrases[i]);
            frases.push(defaultFrases[i]);
        }
    } else {
        for (let i = 0; i < defaultFrases.length; i++) {
            frases.push(localStorage.getItem(("frase" + i)));
        }
    }
});



