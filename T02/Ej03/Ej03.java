package Ej03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.List;

public class Ej03 extends JFrame {

    private JButton btnAdd = new JButton("Añadir Personas");
    private JButton btnShow = new JButton("Mostrar Personas");
    private JButton btnSeek = new JButton("Buscar Personar");
    private List<Persona> agenda = new ArrayList<>();

    public Ej03 () {
        rellenarAgenda(agenda);
        innitComponents();
    }

    private void innitComponents() {
        setSize(new Dimension(500, 500));
        setLayout(new GridLayout(1,3));
        add(btnAdd);
        add(btnSeek);
        add(btnShow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnAdd.addActionListener(this::showAddPersona);
        btnSeek.addActionListener(this::showSeekPersona);
        btnShow.addActionListener(this::showAllPersona);
        setLocationRelativeTo(null);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                escribirAgenda(agenda);
            }
        });

    }

    private void showAddPersona(ActionEvent evt) {
        VentanaAdd vAdd = new VentanaAdd(agenda);
        vAdd.setVisible(true);

    }

    private void showAllPersona(ActionEvent evt) {
        VentanaMostrar vMostrar = new VentanaMostrar(agenda);
        if (agenda.size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay personas en la agenda");
        } else {
            vMostrar.setVisible(true);
        }


    }

    private void showSeekPersona(ActionEvent evt) {
        VentanaSeek vSeek = new VentanaSeek(agenda);
        vSeek.setVisible(true);
    }



    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ej03().setVisible(true);
            }
        });

    }

    private void escribirAgenda(List<Persona> agenda) {
        Path nombreFichero = Path.of("T02/Ej03/personas.dat");

        if (!Files.exists(nombreFichero)) {
            try {
                Files.createFile(nombreFichero);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        try (FileOutputStream fos = new FileOutputStream(nombreFichero.toFile());
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            for (Persona person: agenda) {
                oos.writeObject(person);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void rellenarAgenda(List<Persona> agenda) {
        Path nombreFichero = Path.of("T02/Ej03/personas.dat");


        if (!Files.exists(nombreFichero)) {
            try {
                Files.createFile(nombreFichero);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        try {
            if (Files.size(nombreFichero) > 0) {
                try (FileInputStream fis = new FileInputStream(nombreFichero.toFile());
                     ObjectInputStream ois = new ObjectInputStream(fis)) {

                    while (fis.available() > 0) {
                        Persona p = (Persona) ois.readObject();
                        agenda.add(p);
                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }








}
