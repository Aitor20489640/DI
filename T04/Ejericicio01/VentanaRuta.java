package Ejericicio01;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.nio.file.Path;

public class VentanaRuta extends JFrame {

    private JPanel panelPrincipal;
    private JPanel panelChooser;
    private JButton examinarButton;
    private JTextField txtRuta;
    private JButton btnNext;
    private JCheckBox checkBoxAccesoDirecto;
    private JPanel panelSiguiente;

    public VentanaRuta() {
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(panelChooser, BorderLayout.NORTH);
        add(panelSiguiente, BorderLayout.SOUTH);
        //Coge la ruta absoluta desde la variable de entorno
        txtRuta.setText(System.getProperty("user.dir"));

        //Para abrir el Explorador de archivos, no coge toda la ruta
        examinarButton.addActionListener(e -> {
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            j.setCurrentDirectory(Path.of(System.getProperty("user.dir")).toFile());
            j.setAcceptAllFileFilterUsed(false);
            j.setDialogTitle("Selecciona una carpeta donde instalar");
            j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int r = j.showOpenDialog(null);

            if (r == JFileChooser.APPROVE_OPTION) {
                txtRuta.setText(j.getCurrentDirectory().getAbsolutePath());
            } else {
                txtRuta.setText(System.getProperty("user.dir"));
            }
        });

        //Botón para ir a la siguiente ventana
        btnNext.addActionListener(e -> {
            new VentanaTerminos(this).setVisible(true);
            setVisible(false);
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new VentanaRuta().setVisible(true));
    }
}
