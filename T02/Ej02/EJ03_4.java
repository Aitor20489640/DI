import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ03_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = 0.0;
        boolean ok;

        do {
            try {
                System.out.print("Dime grados celsius: ");
                celsius = sc.nextDouble();
                ok = true;
            } catch (InputMismatchException ex) {
                System.out.println("Necesito numeros.");
                ok = false;
            }
        }while(!ok);

        System.out.println("Estos son los grados en farenheit " + celsiusToFarenheit(celsius));

    }

    public static double celsiusToFarenheit (double c) {
        return ((c * 9 / 5) + 32);
    }
}
