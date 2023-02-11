function dados() {
    //sumas posibles = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
    let resultados = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0];
    let dado1, dado2, suma, comparator;
    for (let i = 0; i < 36000; i++) {
        dado1 = Math.floor((Math.random() * 6) + 1);
        dado2 = Math.floor((Math.random() * 6) + 1);
        suma = dado1 + dado2;
        comparator = 2;
        for (let j = 0; j < resultados.length; j++) {
            if (suma == comparator) {
                resultados[j] += 1;
            }
            comparator++;
        }
    }
    for (let j = 0; j < resultados.length; j++) {
        console.log("array[" + (j + 2) + "]: " + resultados[j] + " veces");
    }
}