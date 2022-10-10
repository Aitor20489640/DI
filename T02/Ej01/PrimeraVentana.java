import javax.swing.*;

public class PrimeraVentana  extends JFrame {
    public PrimeraVentana () {
        super("Mi primera ventana");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new JLabel(new ImageIcon("/media/aitgal/WRXelement/Dam2/GitHub/DI/T02/P01/Wall.jpg")));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PrimeraVentana();
    }

}
