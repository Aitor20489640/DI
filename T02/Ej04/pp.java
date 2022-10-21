package Ej04;

import javax.swing.*;
import java.awt.*;

/**
 * Esta clase crea una ventana con un boton y un campo de texto.
 */
public class pp extends JFrame {
    /**
     * Constructor donde se especifica como será la ventana principal.
     */
    public pp () {
        super("Mi primera ventana");//Llamada al constructo de JFrame con el nombre de la ventana
        setSize(300,300);//Determina el tamaño de la ventana
        setBackground(new Color(0, 64, 128));//Cambia el color de fondo de la ventana
        setSize(600, 600);//Cambia el tamaño de la ventana
        JButton button = new JButton("Pulsa aquí");//Crea un boton con el texto "Pulsa aqui"
        button.setFont(new Font("Arial", Font.PLAIN, 11));//Cambia la fuente del texto en el boton
        button.setBounds(20, 30, 30, 30);//Cambia la posicion y el tamaño del boton en la ventana
        button.setForeground(Color.BLUE);//Cambia el color del texto del boton
        button.setBackground(Color.white);//Cambia el color del fondo del boton
        button.setToolTipText("Esto es una prueba");//Muestra el texto cuando el raton se posiciona encima del boton
        getContentPane().add(button, BorderLayout.NORTH);//Inserta el boton en el contenido de la ventana

        JTextField textField1 = new JTextField();//Crea un cuadro de texto sin contenido
        textField1.setBounds(90, 60, 100, 30);//Cambia la posicion y el tamaño del cuadro de texto
        textField1.setHorizontalAlignment(JTextField.RIGHT);//Especifica que el texto estara alineado en el borde derecho
        textField1.setText("Y aún otra prueba");//Introduce el contenido que tendra el cuadro de texto al abrir el programa
        textField1.setBackground(Color.pink);//Cambia el color de fondo del cuadro de texto
        add(textField1);//Añade el cuadro de texto ocupando el espacio disponible

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Define que el programa al cerrar esta ventana
        setVisible(true);//Hace que la ventana sea visible
    }

    /**
     * Metodo main donde sé instancia el objeto ventana y se crea una ventana emergente con la resolucion del monitor
     * @param args argumentos escritos cuando es ejecutado por linea de comandos
     */
    public static void main(String[] args) {
        pp i= new pp();//Creación de una ventana

        Toolkit toolkit = Toolkit.getDefaultToolkit();//Creación de objeto para saber especificaciones sobre la máquina donde se ejecuta el programa
        Dimension screenSize = toolkit.getScreenSize();//Variable donde se usa un metodo para saber el tamaño del monitor de la máquina donde se ejecuta el programa
        String resolucion = "La resolución de la pantalla es de " +
                (int)screenSize.getWidth() + " x " +
                (int)screenSize.getHeight();//String con el tamaño del monitor usado en la ejecucion del programa.

        JOptionPane.showMessageDialog(null, resolucion,
                "Resolución de la pantalla",
                JOptionPane.INFORMATION_MESSAGE);//Ventana emergente con el título "Resolución de la pantalla"
                                                 // y un mensaje con la resolución del monitor donde se está ejecutando el programa
    }
}
