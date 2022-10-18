package Ej03;

import javax.swing.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class VentanaMostrar extends JFrame {
    int index = 0;
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
    private JButton btnDel;
    private JButton btnFirst;
    private JButton btnNext;
    private JButton btnLast;
    private JButton btnPrevious;
    private JLabel lblIndice;
    public VentanaMostrar(List<Persona> personaList) {
        super("Buscar Persona");
        this.personaList = personaList;
        innitComponents();
        lblIndice.setText((index + 1) + "/" + personaList.size());
    }

    private void innitComponents() {
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
        btnDel = new JButton("Eliminar");
        btnFirst = new JButton("|<");
        btnLast = new JButton(">|");
        btnNext = new JButton(">");
        btnPrevious = new JButton("<");
        lblIndice = new JLabel();
        lblError.setForeground(Color.red);
        txtNombre.setEnabled(false);
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



        btnDel.addActionListener(e -> {
            if (!txtNombre.getText().isEmpty()) {
                removePersona(personaList, txtNombre.getText());
            }
        });
    }

    private void mostrarPersona() {

    }

    private void updateBtn() {
        btnFirst.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNext.setEnabled(false);
        btnLast.setEnabled(false);
        if (index > 0) {
            btnFirst.setEnabled(true);
            btnPrevious.setEnabled(true);
        }
        if (index < personaList.size() - 1) {
            btnNext.setEnabled(true);
            btnLast.setEnabled(true);
        }
    }

    public static void removePersona(List<Persona> agenda, String nombre) {
        agenda.removeIf(p -> p.getNombre().equals(nombre));
    }

}
