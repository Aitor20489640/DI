package Ejericicio01;

import javax.swing.*;
import java.awt.*;

public class VentanaTerminos extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panelLbl;
    private JLabel lblTerminos;
    private JTextPane textPaneTerminos;
    private JButton siguienteButton;
    private JButton anteriorButton;
    private JPanel panelScroll;
    private JCheckBox aceptoLosTerminosYCheckBox;

    public VentanaTerminos(VentanaRuta ventanaRuta) {
        add(panelPrincipal);
        add(panelLbl, BorderLayout.NORTH);
        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Botón para ir hacia la siguiente ventana
        siguienteButton.addActionListener(e -> {
            new VentanaProgreso(this).setVisible(true);
            this.setVisible(false);
        });
        //Botón para volver a la anterior ventana
        anteriorButton.addActionListener(e -> {
            ventanaRuta.setVisible(true);
            this.dispose();
        });
        //Activo el botón siguiente solo cuando el checkbox está seleccionado
        aceptoLosTerminosYCheckBox.addActionListener(e -> siguienteButton.setEnabled(aceptoLosTerminosYCheckBox.isSelected()));
    }
}
