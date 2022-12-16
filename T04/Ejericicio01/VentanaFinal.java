package Ejericicio01;

import javax.swing.*;
import java.awt.*;

public class VentanaFinal extends JFrame{
    private JPanel panelPrincipal;
    private JButton exitButton;
    private JTextPane seHaTerminadoDeTextPane;
    private JPanel panelBotones;

    public VentanaFinal() {
        add(panelPrincipal);
        add(panelBotones, BorderLayout.SOUTH);
        setSize(new Dimension(500, 300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        seHaTerminadoDeTextPane.setEditable(false);

        exitButton.addActionListener(e -> {
            System.exit(0);
        });
    }
}
