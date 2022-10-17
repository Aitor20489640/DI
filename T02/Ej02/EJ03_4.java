package Ej02;

import javax.swing.*;
import java.awt.*;

public class EJ03_4 {
    public EJ03_4() {
        JFrame JExplicacion = new JFrame("Ventana");
        JButton btnContinue = new JButton("Continuar");
        JFrame JMain = new JFrame("Ventana");
        JTextField txtC = new JTextField();
        JTextField txtF = new JTextField();
        JButton btnCelsiusFahrenheit = new JButton("Cº -> Fº");
        JLabel lblError = new JLabel("", SwingConstants.CENTER);
        JButton btnFahrenheitCelsius = new JButton("Fº -> C1");
        JButton btnExit = new JButton("Exit");

        JExplicacion.setLayout(new BorderLayout(10, 10));
        JExplicacion.add(new JLabel("Programa para convertir celsius a fahrenheit", SwingConstants.CENTER), BorderLayout.CENTER);
        JExplicacion.add(btnContinue, BorderLayout.SOUTH);
        JExplicacion.setSize(500, 500);
        JExplicacion.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JExplicacion.setLocationRelativeTo(null);
        JExplicacion.setVisible(true);

        JMain.setLayout(new GridLayout(5, 2, 2, 2));
        JMain.add(lblError);
        JMain.add(new JLabel(""));
        JMain.add(new JLabel("Celsius", SwingConstants.CENTER));
        JMain.add(new JLabel("Fahrenheit", SwingConstants.CENTER));
        JMain.add(txtC);
        JMain.add(txtF);
        JMain.add(btnCelsiusFahrenheit);
        JMain.add(btnFahrenheitCelsius);
        JMain.add(btnExit);

        JMain.setSize(600, 500);
        JMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JMain.setLocationRelativeTo(null);
        lblError.setForeground(Color.red);

        //Cambio la creación de un ActionListener() por lambda.
        btnContinue.addActionListener(e -> {
            JExplicacion.dispose();
            JMain.setVisible(true);

        });
        //Cambio la creación de un ActionListener() por lambda.
        btnCelsiusFahrenheit.addActionListener(e -> {
            if (txtC.getText().isEmpty()) {
                lblError.setText("El campo celsius no puede estar vacio");
                txtF.setText("");
            }else {
                lblError.setText("");
                try {
                    txtF.setText(String.valueOf(celsiusToFahrenheit(Double.parseDouble(txtC.getText()))));
                } catch (NumberFormatException ex) {
                    lblError.setText("Solo puedes convertir numeros");
                }
            }
        });

        btnFahrenheitCelsius.addActionListener(e -> {
            if (txtF.getText().isEmpty()) {
                lblError.setText("El campo fahrenheit no puede estar vacio");
                txtC.setText("");
            } else {
                lblError.setText("");
                try {
                    txtC.setText(String.valueOf(fahrenheitToCelsius(Double.parseDouble(txtF.getText()))));
                } catch (NumberFormatException ex) {
                    lblError.setText("Solo puedes convertir numeros");
                }
            }
        });

        btnExit.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        new EJ03_4();
    }

    public static double celsiusToFahrenheit (double c) {
        return ((c * 9 / 5) + 32);
    }

    public static double fahrenheitToCelsius(double f) {
        return ((f - 32) * 5 / 9);
    }
}
