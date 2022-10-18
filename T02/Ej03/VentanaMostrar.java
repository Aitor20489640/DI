package Ej03;

import javax.swing.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class VentanaMostrar extends JFrame {
    private int index = 0;
    private Persona p;
    private List<Persona> personaList;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblFecha;
    private JTextField txtFecha;
    private JPanel JPaneText;
    private JPanel JPaneButtons;
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
        p = personaList.get(index);
        innitComponents();
        lblIndice.setText((index + 1) + "/" + personaList.size());
        mostrarPersona(p);
        updateBtn();
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
        btnExit = new JButton("Volver");
        btnDel = new JButton("Eliminar");
        btnFirst = new JButton("|<");
        btnLast = new JButton(">|");
        btnNext = new JButton(">");
        btnPrevious = new JButton("<");
        lblIndice = new JLabel();
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
        JPaneButtons.add(new JLabel(" ".repeat(15)));
        JPaneButtons.add(btnFirst);
        JPaneButtons.add(btnPrevious);
        JPaneButtons.add(lblIndice);
        JPaneButtons.add(btnNext);
        JPaneButtons.add(btnLast);
        JPaneButtons.add(btnExit);
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

        btnExit.addActionListener(e -> {
            this.dispose();
        });

        btnFirst.addActionListener(e -> {
                index = 0;
                p = personaList.get(index);
                mostrarPersona(p);
                updateBtn();
                lblIndice.setText(index + 1 + "/" + personaList.size());
        });

        btnPrevious.addActionListener(e -> {
            if (index > 0) {
                p = personaList.get(index - 1);
                index--;
                mostrarPersona(p);
                updateBtn();
                lblIndice.setText(index + 1 + "/" + personaList.size());
            }
        });

        btnNext.addActionListener(e -> {
            if (index < personaList.size() - 1) {
                p = personaList.get(index + 1);
                index++;
                mostrarPersona(p);
                updateBtn();
                lblIndice.setText(index + 1 + "/" + personaList.size());
            }
        });

        btnLast.addActionListener(e -> {
            index = personaList.size() -1;
            p = personaList.get(index);
            mostrarPersona(p);
            updateBtn();
            lblIndice.setText(index + 1 + "/" + personaList.size());
        });



        btnDel.addActionListener(e -> {
            if (!txtNombre.getText().isEmpty()) {
                removePersona(personaList, txtNombre.getText());
            }
        });
    }

    private void mostrarPersona(Persona p) {
        txtNombre.setText(p.getNombre());
        txtEmail.setText(p.getEmail());
        txtFecha.setText(p.getDateOfBirth().format(DateTimeFormatter.ISO_LOCAL_DATE));
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

    public void removePersona(List<Persona> agenda, String nombre) {
        agenda.removeIf(p -> p.getNombre().equals(nombre));
    }

}
