import javax.swing.*;
import java.awt.*;

public class Gui01 extends JFrame {
    private Container panel;
    private JButton miBtn;
    private JButton miBtn2;
    private JButton miBtn3;


    public Gui01() {
        super("Ventana con un boton");
        miBtn = new JButton("Aceptar");
        miBtn2 = new JButton("Cancelar");
        miBtn3 = new JButton("Salir");
        miBtn3.addActionListener(new EscuchadoraBtn());
        panel = getContentPane();
        panel.add(miBtn);
        panel.add(miBtn2);
        panel.add(miBtn3);
        addWindowListener(new EscuchadorVentana());
        setSize(200,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Gui01 gui01 = new Gui01();
    }
}
