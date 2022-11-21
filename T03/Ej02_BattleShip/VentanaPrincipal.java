package Ej02_BattleShip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame{
    private JPanel panelPrincipal;
    private JButton empezarButton;
    private JButton salirButton;
    private JLabel lblTitle;

    public VentanaPrincipal()   {
        innitComponentes();
        empezarButton.addActionListener(a -> {
            new VentanaPonerBarcos().setVisible(true);
        });
    }

    private void innitComponentes(){
        add(panelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(500,500));

        empezarButton.addActionListener(a -> {

        });

        salirButton.addActionListener(a -> {
            System.exit(0);
        });
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }
}
