import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EscuchadorVentana extends WindowAdapter {
    @Override
    public void windowDeiconified(WindowEvent evt) {
        System.out.println("Ha vuelto a su tamaño");
    }
    @Override
    public void windowIconified(WindowEvent evt) {
        System.out.println("Se ha minimizado");
    }
}
