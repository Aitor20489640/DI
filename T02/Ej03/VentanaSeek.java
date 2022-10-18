package Ej03;

import javax.swing.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class VentanaSeek extends JFrame {
    private List<Persona> personaList;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblFecha;
    private JTextField txtFecha;
    private JPanel JPaneText;
    private JPanel JPaneButtons;
    private JPanel JPaneError;
    private JLabel lblError;
    private JButton btnExit;
    private JButton btnSeek;
    private JButton btnDel;

    public VentanaSeek(List<Persona> personaList) {
        super("Buscar Persona");
        this.personaList = personaList;
        innitComponents();
    }

    private void innitComponents(){
        JPaneText = new JPanel();
        lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField();
        lblEmail = new JLabel("Email");
        txtEmail = new JTextField();
        lblFecha = new JLabel("Fecha");
        txtFecha = new JTextField();
        JPaneButtons = new JPanel(new FlowLayout());
        JPaneError = new JPanel();
        btnExit = new JButton("Salir");
        btnSeek = new JButton("Buscar");
        lblError = new JLabel("");
        btnDel = new JButton("Eliminar");
        lblError.setForeground(Color.red);
        txtEmail.setEnabled(false);
        txtFecha.setEnabled(false);
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        JPaneText.add(lblNombre);
        JPaneText.add(txtNombre);
        JPaneText.add(lblEmail);
        JPaneText.add(txtEmail);
        JPaneText.add(lblFecha);
        JPaneText.add(txtFecha);
        JPaneButtons.add(btnDel);
        JPaneButtons.add(btnSeek);
        JPaneButtons.add(btnExit);
        JPaneError.add(lblError);
        GroupLayout groupLayout = new GroupLayout(JPaneText);
        setLayout(new BorderLayout());
        JPaneText.setLayout(groupLayout);
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre)
                                .addComponent(lblEmail)
                                .addComponent(lblFecha))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre)
                                .addComponent(txtEmail)
                                .addComponent(txtFecha))
        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNombre)
                                .addComponent(txtNombre))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEmail)
                                .addComponent(txtEmail))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFecha)
                                .addComponent(txtFecha))
        );

        add(JPaneText, BorderLayout.CENTER);
        add(JPaneButtons, BorderLayout.SOUTH);
        add(JPaneError, BorderLayout.NORTH);

        btnExit.addActionListener(e -> {
            this.dispose();
        });

        btnSeek.addActionListener(e -> {
            if (txtNombre.getText().isEmpty()) {
                lblError.setText("El nombre no puede estar vacio");
            } else {
                lblError.setText("");
                Persona p = buscarPersona(personaList);
                if (p != null) {
                    txtEmail.setText(p.getEmail());
                    txtFecha.setText(p.getDateOfBirth().format(DateTimeFormatter.ISO_LOCAL_DATE));
                } else {
                    lblError.setText("No existe ninguna persona con ese nombre en la agenda");
                }

            }

        });

        btnDel.addActionListener(e -> {
            if (!txtNombre.getText().isEmpty()) {
                removePersona(personaList, txtNombre.getText());
            }
        });
    }


    public Persona buscarPersona(List<Persona> agenda) {
        String nombre = txtNombre.getText();

        for (Persona p : agenda) {
            if(p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    public static void removePersona(List<Persona> agenda, String nombre) {
        agenda.removeIf(p -> p.getNombre().equals(nombre));
    }
}
