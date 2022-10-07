import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscuchadoraBtn implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e){
        JFrame ventana = new JFrame("ventana");
        JTextField txt = new JTextField("Se acciono el boton");
        ventana.add(txt);
        ventana.setSize(200,200);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
