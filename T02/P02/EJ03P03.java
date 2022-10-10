import javax.swing.*;

public class EJ03P03 extends JFrame {

    public EJ03P03 () {
        super("Prueba");
        JTextField txt = new JTextField("Introduce un texto");
        setSize(500,500);
        add(txt);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new EJ03P03();
    }


}
