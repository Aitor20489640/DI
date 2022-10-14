import javax.swing.*;
import java.awt.*;

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
        JButton btnCelsiusFahrenheit = new JButton("Cº -> Fº");
        JLabel lblError = new JLabel("", SwingConstants.CENTER);
        lblError.setForeground(Color.red);

        JExplicacion.setLayout(new BorderLayout(10, 10));
        JExplicacion.add(new JLabel("Programa para convertir celsius a fahrenheit", SwingConstants.CENTER), BorderLayout.CENTER);
        JExplicacion.add(btnContinue, BorderLayout.SOUTH);
        JExplicacion.setSize(500, 500);
        JExplicacion.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JExplicacion.setLocationRelativeTo(null);
        JExplicacion.setVisible(true);

        JMain.setLayout(new GridLayout(4, 2, 2, 2));
        JMain.add(lblError);
        JMain.add(new JLabel(""));
        JMain.add(new JLabel("Celsius", SwingConstants.CENTER));
        JMain.add(new JLabel("Fahrenheit", SwingConstants.CENTER));
        JMain.add(txtC);
        JMain.add(txtF);
        JMain.add(btnCelsiusFahrenheit);
        JMain.setSize(500, 500);
        JMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JMain.setLocationRelativeTo(null);

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
    }

    public static void main(String[] args) {
        new EJ03_4();
    }

    public static double celsiusToFahrenheit (double c) {
        return ((c * 9 / 5) + 32);
    }
}
