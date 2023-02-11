let links = document.getElementsByTagName("a");
let numberOfPrueba = 0;

console.log("Número de enlaces de la página: " + links.length);
console.log("Dirección a la que enlaza el penúltimo enlace: " + links[links.length - 2].href);

for (let i = 0; i < links.length; i++) {
    if (links[i].href == "http://prueba/") {
        numberOfPrueba++;
    }
}
console.log("Numero de enlaces que enlazan a http://prueba: " + numberOfPrueba);

let p = document.getElementsByTagName("p");
links = p[2].getElementsByTagName("a");
console.log("Número de enlaces del tercer párrafo: " + links.length);