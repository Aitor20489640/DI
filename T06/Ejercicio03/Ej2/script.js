const valores = [true, 5, false, "hola", "adios", 2];

if (valores[3] > valores[4]) {
    console.log(valores[3] + " es mayor");
} else if (valores[4] > valores[3]) {
    console.log(valores[4] + " es mayor");
}
let incr = valores[1];
let decr = valores[5];
incr++;
decr--;

let cadena = "+: " + (valores[1] + valores[5])
    + "\n-; " + (valores[1] - valores[5])
    + "\n*: " + (valores[1] * valores[5])
    + "\n/: " + (valores[1] / valores[5])
    + "\n**: " + (valores[1] ** valores[5])
    + "\n%: " + (valores[1] % valores[5])
    + "\n++: " + incr
    + "\n--: " + decr;

console.log(cadena)