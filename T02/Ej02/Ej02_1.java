import javax.swing.*;
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej02_1 {
    public Ej02_1(String title) {
        JFrame frame = new JFrame(title);
        frame.setSize((int) (Math.random() * ((500 - 100) + 100)), (int) (Math.random() * ((500 - 100) + 100)));
        frame.setLocation((int) (Math.random() * ((1980 - 1) + 1)), (int) (Math.random() * ((1080 - 1) + 1)));
        frame.getContentPane().setBackground(generateRandomColor());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        int numFrame = 0;
        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        do {
            System.out.print("Dime el numero de ventanas a abrir: ");
            try {
                numFrame = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Solo se pueden introducir numeros.");
                ok = false;
            }
        }while(!ok);

        for (int i = 1; i <= numFrame; i++){
            new Ej02_1("Ventana " + i);
        }
    }

    public static int generate255To0(){
        return (int) (Math.random() * (255 - 1) + 1);
    }

    public static Color generateRandomColor(){
        return new Color(generate255To0(), generate255To0(), generate255To0());
    }
}
