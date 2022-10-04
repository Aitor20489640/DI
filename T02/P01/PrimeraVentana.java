import javax.swing.JFrame;
import javax.swing.text.Position;
import java.awt.*;

public class PrimeraVentana  extends JFrame {
    public PrimeraVentana (){
        super("Mi primera ventana");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.red);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PrimeraVentana();
    }

}
