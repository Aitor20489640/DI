async function predecirFuturo() {
    let frases = ["Tendrás un día de alegrías y buenos momentos, disfrútalos como nunca.", "Tendrás un día de alegrías y buenos momentos, disfrútalos como nunca.",
        "Concéntrate en lo que quieres lograr y ganaras. No lo olvides.", "El cielo sera tu limite, pues grandes acontecimientos te sucederán.",
        "Te sentirás feliz como un niño y veras al mundo con sus ojos.", "Vivirás tu vejez con comodidades y riquezas materiales.",
        "Confía en tu suerte, que es mucha y te rodeara de prosperidad.", "No todo el mundo puede recibir las mismas cosas. Se practico.",
        "Te aguarda una larga y feliz vida.", "Muy pronto seras incluido en muchas reuniones, fiestas y tertulias.",
        "Cuando busques lo que mas deseas, recuerda hacer tu mejor esfuerzo.", "Tienes por delante un maravilloso día para triunfar; disfrútalo y compártelo.",
        "Hoy seras reconocido por tus dones especiales y lograras ser feliz por muchas horas.", "Tu corazón estallara de alegría con la llegada de buenas noticias.",
        "Seras promovido en tu trabajo debido a tus logros y capacidades."];
    let random = Math.floor(Math.random() * frases.length);
    document.getElementById("futuro").innerHTML = frases[random];
}

