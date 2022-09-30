### Exercise 1.
Construir una clase ArrayReales que declare un atributo de tipo double[] y que
implemente una interfaz llamada Estadisticas. El contenido de esta interfaz es el siguiente:

    public interface Estadisticas {
        double minimo();
        double maximo();
        double sumatorio();
    }
### Exercise 2
Construir una clase final Math3 que amplíe las declaraciones de métodos estáticos de la clase
Math y que implemente una interfaz llamada Extremos compilada con el siguiente código fuente:

    public interface Extremos {
        int min(int [] a);
        int max(int [] a);
        double min(double [] a);
        double max(double [] a);
    }
### Exercise 3
Construir una interfaz Relaciones (y posteriormente una clase que la implemente) que incluya
los siguientes métodos:

// Devuelve verdadero si a es mayor que b

    boolean esMayor(Object b) ;

// Devuelve verdadero si a es menor que b

    boolean esMenor(Object b) ;

// Devuelve verdadero si a es igual que b

    boolean esIgual(Object b) ;
### Exercise 4
Harry Potter needs help identifying what each house means.

Read a string representing a house and output the following:

    if it is "gryffindor", output "bravery";
    if it is "hufflepuff", output "loyalty";
    if it is "slytherin", output "cunning";
    if it is "ravenclaw", output "intellect";
    otherwise, output "not a valid house".
The problem was taken from the course Introduction to JavaScript and React by Ken McGrady and adapted for our purpose.

    Sample Input 1: gryffindor
    Sample Output 1: bravery
### Exercise 5
Construct the program that reads and prints input data char by char.

Use < and > to adjust a code tabulation. Set a single tab for the loop body.

#### Hint
    Rearrange the lines to make the code work. Use the buttons on the left to add indentation.
        Reader reader = new FileReader("file.txt");
        int current = reader.read();
        while (current != -1) {
        System.out.print((char) current);
        current = reader.read();
        }
        reader.close();
### Exercise 6
What does the following code? Could it be improved further?

    public class NoIndexOutOfBoundsExceptions {
        public static void main(String[] args) {
        int[] hardCodedArray = { 3, 2, 4, 5, 1 };
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (index > hardCodedArray.length - 1) {
            System.out.println("The index is out of bounds.");
        } else {
            System.out.println(hardCodedArray[index]);
        }
      }
    }
### Exercise 7
Why is this code needed?

    Reader reader = null;
    try {
        reader = new FileReader("file.txt");
        // code which may throw an exception
    } finally {
        reader.close();
    }