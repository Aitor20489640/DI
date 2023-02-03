
let frases = ["tendrás un día de alegrías y buenos momentos, disfrútalos como nunca.", "tendrás un día de alegrías y buenos momentos, disfrútalos como nunca.",
    "concéntrate en lo que quieres lograr y ganaras. No lo olvides.", "el cielo sera tu limite, pues grandes acontecimientos te sucederán.",
    "te sentirás feliz como un niño y veras al mundo con sus ojos.", "vivirás tu vejez con comodidades y riquezas materiales.",
    "confía en tu suerte, que es mucha y te rodeara de prosperidad.", "no todo el mundo puede recibir las mismas cosas. Se practico.",
    "te aguarda una larga y feliz vida.", "muy pronto seras incluido en muchas reuniones, fiestas y tertulias.",
    "cuando busques lo que mas deseas, recuerda hacer tu mejor esfuerzo.", "tienes por delante un maravilloso día para triunfar; disfrútalo y compártelo.",
    "hoy seras reconocido por tus dones especiales y lograras ser feliz por muchas horas.", "tu corazón estallara de alegría con la llegada de buenas noticias.",
    "seras promovido en tu trabajo debido a tus logros y capacidades."];
let person;

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
    let random = Math.floor(Math.random() * frases.length);
    const sonido = cargarSonido("dystopian-future.mp3");

    if (person == null) {
        person= window.prompt("Indica tu nombre");
    }
    if (person == null || person == "") {// Se comprueba si el nombre indicado esta vacio y se asigna un nombre por defecto.
        person = "Usuario";
    }
    document.getElementById("futuro").innerHTML = "Consultando a los espíritus…";
    sonido.play();
    await new Promise(resolve => setTimeout(resolve, 3000)); // Se espera un segundo a dar la respuesta a para darle un carácter misterioso.
    document.getElementById("futuro").innerHTML = person + ", " + frases[random];
    sonido.pause();
    sonido.currentTime = 0;
}

function addFrases() {
    let frase = document.getElementById("addFrase").value;

    if (frase !== "") {// Se comprueba si la frase no esta vacia
        if (frase.match(/^[A-Za-z,.]+$/)){ // Se comprueba si la frase tiene letras
            frases.push(frase); // Se añade la frase al array
        } else {
            alert("La frase debe contener caracteres");
        }
    } else {
        alert("La frase no puede estar vacia");

    }
}



