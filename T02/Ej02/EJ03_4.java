import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ03_4 {
    public EJ03_4() {
        JFrame JExplicacion = new JFrame("Ventana");
        JButton btnContinue = new JButton("Continuar");

        JExplicacion.setLayout(new BorderLayout(10, 10));
        JExplicacion.add(new JLabel("Programa para convertir celsius a farenheit", SwingConstants.CENTER), BorderLayout.CENTER);
        JExplicacion.add(btnContinue, BorderLayout.SOUTH);
        JExplicacion.setSize(500, 500);
        JExplicacion.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JExplicacion.setLocationRelativeTo(null);
        JExplicacion.setVisible(true);

        btnContinue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JExplicacion.dispose();

            }
        });
    }

    public static void main(String[] args) {

        new EJ03_4();

        /*Scanner sc = new Scanner(System.in);
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

        System.out.println("Estos son los grados en farenheit " + celsiusToFarenheit(celsius));*/

    }

    public static double celsiusToFarenheit (double c) {
        return ((c * 9 / 5) + 32);
    }
}
