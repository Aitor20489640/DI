package Ej03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.time.format.DateTimeParseException;
import java.util.List;

public class VentanaAdd extends JFrame {
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
    private JButton btnSave;
    public VentanaAdd (List<Persona> personaList) {
        super("Añadir Persona");
        this.personaList = personaList;
        innitComponents();
    }

    private void innitComponents() {
        JPaneText = new JPanel();
        lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField();
        lblEmail = new JLabel("Email");
        txtEmail = new JTextField();
        lblFecha = new JLabel("Fecha");
        txtFecha = new HintTextField("Formato fecha de nacimiento(yyyy-mm-dd)");
        JPaneButtons = new JPanel(new FlowLayout());
        JPaneError = new JPanel();
        btnExit = new JButton("Salir");
        btnSave = new JButton("Guardar");
        lblError = new JLabel("");
        lblError.setForeground(Color.red);
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        JPaneText.add(lblNombre);
        JPaneText.add(txtNombre);
        JPaneText.add(lblEmail);
        JPaneText.add(txtEmail);
        JPaneText.add(lblFecha);
        JPaneText.add(txtFecha);
        JPaneButtons.add(btnSave);
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

        btnSave.addActionListener(e -> {
            if (txtNombre.getText().isEmpty()) {
                lblError.setText("El nombre no puede estar vacio");
            }
            else if (txtEmail.getText().isEmpty()) {
                lblError.setText("El email no puede estar vacio");
            }
            else if (txtFecha.getText().isEmpty()) {
                lblError.setText("La fecha no puede estar vacia");
            } else {
                lblError.setText("");
                Persona p = crearPersona();
                boolean exist = existePersona(personaList, p.getNombre());
                if (exist) {
                    removePersona(personaList, p.getNombre());
                    personaList.add(p);
                } else {
                    personaList.add(p);
                }
            }
        });


    }





    public Persona crearPersona() {
        String nombre, email, date;
        Persona p = null;

        nombre = txtNombre.getText();
        email = txtEmail.getText();
        date = txtFecha.getText();

        try {
            p = new Persona(nombre, email, date);
        }
        catch (FormatException e) {
            lblError.setText("Formato de email incorrecto");
        }catch (DateTimeParseException ex) {
            lblError.setText("Formato de fecha incorrecta");
        }

        return p;

    }

    public static boolean existePersona(List<Persona> agenda, String nombre) {
        for (Persona p : agenda) {
            if(p.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public static boolean removePersona(List<Persona> agenda, String nombre) {
        return agenda.removeIf(p -> p.getNombre().equals(nombre));
    }

    /**
     * Clase interna para poner hint de como es el formato de la fecha
     */
    private class HintTextField extends JTextField implements FocusListener {

        private final String hint;
        private boolean showingHint;

        public HintTextField(final String hint) {
            super(hint);
            this.hint = hint;
            this.showingHint = true;
            super.addFocusListener(this);
        }

        @Override
        public void focusGained(FocusEvent e) {
            if(this.getText().isEmpty()) {
                super.setText("");
                showingHint = false;
            }
        }
        @Override
        public void focusLost(FocusEvent e) {
            if(this.getText().isEmpty()) {
                super.setText(hint);
                showingHint = true;
            }
        }

        @Override
        public String getText() {
            return showingHint ? "" : super.getText();
        }
    }
}


