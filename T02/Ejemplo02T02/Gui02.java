import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Gui02 {

    public Gui02() {
        JFrame flowLayout = new JFrame("Layout fluido");
        JFrame borderLayout = new JFrame("Layout con bordes");
        JFrame gridLayout = new JFrame("Layout en casillas");
        //FlowLayout
        flowLayout.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        for (int i = 1; i <= 10; i++)
            flowLayout.add(new JButton("Componente " + i));
        flowLayout.setSize(500,500);
        flowLayout.setVisible(true);
        flowLayout.setLocationRelativeTo(null);
        flowLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //BorderLayout
        borderLayout.setLayout(new BorderLayout(5, 5));
        borderLayout.add(new JButton("1"), BorderLayout.EAST);
        borderLayout.add(new JButton("2"), BorderLayout.SOUTH);
        borderLayout.add(new JButton("3"), BorderLayout.WEST);
        borderLayout.add(new JButton("4"), BorderLayout.NORTH);
        borderLayout.add(new JButton("5"), BorderLayout.CENTER);
        borderLayout.setSize(500,500); //pack();
        borderLayout.setVisible(true);
        borderLayout.setLocation(200, 450);
        borderLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //GridLayout
        gridLayout.setLayout(new GridLayout(4, 3, 2, 2));
        for(int i = 1; i <= 10; i++)
            gridLayout.add(new JButton(Integer.toString(i)));
        gridLayout.setSize(500,500);
        gridLayout.setVisible(true);
        gridLayout.setLocation(1000, 100);
        gridLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Gui02 gui02 = new Gui02();
    }
}
