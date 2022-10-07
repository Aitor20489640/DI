import javax.swing.*;
import java.util.Scanner;

public class Ej02P02 extends JFrame {
    public Ej02P02(String window, String btn)  {
        super(window);
        JButton myBtn = new JButton(btn);
        setSize(300, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().add(myBtn);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Ej02P02 frame = new Ej02P02("Hola", "Adios");
        Scanner sc = new Scanner(System.in);
        String window, btn;

        System.out.println("Escribe el nombre de la ventana: ");
        window = sc.nextLine();
        System.out.println("Escribe el texto del boton: ");
        btn = sc.nextLine();

        frame.dispose();

        Ej02P02 frame2 = new Ej02P02(window, btn);
    }
}
