import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ03_4 {

    public JFrame JExplicacion;
    public JFrame JMain;
    public JTextField txtC;
    public JTextField txtF;
    public EJ03_4() {
        JExplicacion = new JFrame("Ventana");
        JButton btnContinue = new JButton("Continuar");
        JMain = new JFrame("Ventana");
        txtC = new JTextField();
        txtF = new JTextField();

        JExplicacion.setLayout(new BorderLayout(10, 10));
        JExplicacion.add(new JLabel("Programa para convertir celsius a farenheit", SwingConstants.CENTER), BorderLayout.CENTER);
        JExplicacion.add(btnContinue, BorderLayout.SOUTH);
        JExplicacion.setSize(500, 500);
        JExplicacion.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JExplicacion.setLocationRelativeTo(null);
        JExplicacion.setVisible(true);

        JMain.setLayout(new GridLayout(3, 2, 5, 5));
        JMain.add(new JLabel("Celsius"), SwingConstants.CENTER);
        JMain.add(new JLabel("Fahrenheit"), SwingConstants.CENTER);
        JMain.add(txtC);
        JMain.add(txtF);
        JMain.setSize(500, 500);
        JMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JMain.setLocationRelativeTo(null);


        btnContinue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JExplicacion.dispose();
                JMain.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {

        EJ03_4 ej034 = new EJ03_4();

        Scanner sc = new Scanner(System.in);
        double celsius = 0.0;
        boolean ok;

        do {
            try {
                System.out.print("Dime grados celsius: ");
                celsius = sc.nextDouble();
                ok = true;
                ej034.txtC.setText(String.valueOf(celsius));
            } catch (InputMismatchException ex) {
                System.out.println("Necesito numeros.");
                ok = false;
            }
        }while(!ok);

        ej034.txtF.setText(String.valueOf(celsiusToFahrenheit(celsius)));

    }

    public static double celsiusToFahrenheit (double c) {
        return ((c * 9 / 5) + 32);
    }
}
