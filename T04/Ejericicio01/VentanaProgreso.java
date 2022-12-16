package Ejericicio01;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.*;

public class VentanaProgreso extends JFrame{
    private JPanel panelProgreso;
    private JProgressBar progressBarInstalacion;
    private JPanel panelBotones;
    private JButton siguienteButton;
    private JButton anteriorButton;
    private JPanel panelBar;
    private JButton instalarButton;

    public VentanaProgreso(VentanaTerminos ventanaTerminos) {
        add(panelBar, BorderLayout.NORTH);
        add(panelProgreso);
        add(panelBotones, BorderLayout.SOUTH);
        setSize(new Dimension(500, 150));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        instalarButton.addActionListener(e -> install());

        anteriorButton.addActionListener(e -> {
            ventanaTerminos.setVisible(true);
            this.dispose();
        });

        siguienteButton.addActionListener(e -> {

        });
    }

    public void install(){
        Executors.newSingleThreadExecutor().execute(() -> {
            for (int i = 1; i <= 100; i++) {
                progressBarInstalacion.setValue(i);
                try{
                    Thread.sleep(500);
                } catch (InterruptedException ignored){
                }
            }
            siguienteButton.setEnabled(true);
        });
    }
}
