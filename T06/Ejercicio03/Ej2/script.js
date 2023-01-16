const valores = [true, 5, false, "hola", "adios", 2];
let string1 = null;
let string2 = null;

for (const valor of valores)
{
    if (typeof(valor) === 'string') {
        if (string1 == null) {
            string1 = valor;
        } else {
            string2 = valor;
        }
    }
}

if (string1 > string2) {
    console.log("1." + string1 + " es mayor");
} else if (string2 > string1) {
    console.log("1." + string2 + " es mayor");
}

let boolean1 = null;
let boolean2 = null;

for (const valor of valores) {
    if (typeof(valor) === 'boolean') {
        if (boolean1 == null) {
            boolean1 = valor;
        } else {
            boolean2 = valor;
        }
    }
}

if (boolean1 || boolean2) {
    console.log("2. Operador OR puede entrar porque uno es true");
}

let number1 = null;
let number2 = null;

for (const valor of valores) {
    if (typeof(valor) === 'number') {
        if (number1 == null) {
            number1 = valor;
        } else {
            number2 = valor;
        }
    }
}

let cadena = "+: " + (number1 + number2)
    + "\n-; " + (number1 - number2)
    + "\n*: " + (number1 * number2)
    + "\n/: " + (number1 / number2)
    + "\n**: " + (number1 ** number2)

console.log("3.\n" + cadena);