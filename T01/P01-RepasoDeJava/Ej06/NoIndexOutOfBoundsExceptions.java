import java.util.Scanner;

public class NoIndexOutOfBoundsExceptions {
    public static void main(String[] args) {
        //The code takes a number from the user and shows the number in the index of the array,
        //if the number is greater than the length - 1 of the array, it shows the user a error message
        int[] hardCodedArray = { 3, 2, 4, 5, 1 };
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        // Code improvement
        try {
            System.out.println(hardCodedArray[index]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("The index is out of bounds.");
        }


        //Original code
        /*if (index > hardCodedArray.length - 1) {
            System.out.println("The index is out of bounds.");
        } else {
            System.out.println(hardCodedArray[index]);
        }*/
    }

}
