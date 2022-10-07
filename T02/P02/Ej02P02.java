import javax.swing.*;

public class Ej02P02 {
    public Ej02P02() {
        JFrame frame = new JFrame("hola");
        JButton myBtn = new JButton("Adios");

        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(myBtn);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Ej02P02 frame = new Ej02P02();

    }
}
