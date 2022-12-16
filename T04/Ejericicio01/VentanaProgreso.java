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

        //Botón para accionar la progressBar y simular que se está instalando algo
        instalarButton.addActionListener(e -> {
            install();
            instalarButton.setEnabled(false);
        });
        //Botón para ir a la anterior ventana
        anteriorButton.addActionListener(e -> {
            ventanaTerminos.setVisible(true);
            this.dispose();
        });
        //Botón para ir a la última ventana
        siguienteButton.addActionListener(e -> {
            new VentanaFinal().setVisible(true);
            this.dispose();
        });
    }

    /**
     * Método para simular que se esta instalando algo y no bloquee la ventana
     */
    public void install(){
        Executors.newSingleThreadExecutor().execute(() -> {
            for (int i = 1; i <= 100; i++) {
                progressBarInstalacion.setValue(i);
                try{
                    Thread.sleep(500);
                } catch (InterruptedException ignored){
                }
            }
            //Se habilitará después de haber llegado al 100%
            siguienteButton.setEnabled(true);
        });
    }
}
