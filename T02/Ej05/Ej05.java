package Ej05;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class Ej05 extends JFrame {

    private JPanel panelContenido;
    private JLabel lblError;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblApellidos;
    private JTextField txtApellidos;
    private JLabel lblDni;
    private JTextField txtDni;
    private JLabel lblTelefono;
    private JFormattedTextField txtTelefono;
    private JLabel lblDireccion;
    private JTextField txtDireccion;
    private JLabel lblCP;
    private JTextField txtCP;
    private JLabel lblCiudad;
    private JTextField txtCiudad;
    private JLabel lblNFederado;
    private JTextField txtNFederado;
    private JCheckBox checkHombre;
    private JCheckBox checkMujer;
    private JLabel lblPassw;
    private JPasswordField txtPassw;
    private JLabel lblConfirmPassw;
    private JPasswordField txtConfirmPassw;
    private JLabel lblPosicion;
    private JComboBox<String> comboPosicion;
    private JLabel lblArma;
    private JComboBox<String> comboArma;
    private JCheckBox checkSolo;
    private JCheckBox checkGrupo;
    private JButton btnSave;
    private GroupLayout groupLayout;
    private MaskFormatter MaskTelefono;
    private ButtonGroup checkGender;


    public Ej05() {
        innitComponents();
    }

    public void innitComponents() {
        try {
            MaskTelefono = new MaskFormatter("#########");
        } catch(ParseException ex) {
            ex.printStackTrace();
        }
        setSize(new Dimension(1500, 1000));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panelContenido = new JPanel();
        lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField();
        lblApellidos = new JLabel("Apellidos");
        txtApellidos = new JTextField();
        lblDni = new JLabel("DNI");
        txtDni = new JTextField();
        lblTelefono = new JLabel("Teléfono");
        txtTelefono = new JFormattedTextField(MaskTelefono);
        lblDireccion = new JLabel("Dirección");
        txtDireccion = new JTextField();
        lblCP = new JLabel("Codigo Postal");
        txtCP = new JTextField();
        lblCiudad = new JLabel("Ciudad");
        txtCiudad = new JTextField();
        lblNFederado = new JLabel("Nº Federado");
        txtNFederado = new JTextField();
        checkHombre = new JCheckBox("Hombre");
        checkMujer = new JCheckBox("Mujer");
        lblPassw = new JLabel("Contraseña");
        txtPassw = new JPasswordField();
        lblConfirmPassw = new JLabel("Confirmar Contraseña");
        txtConfirmPassw = new JPasswordField();
        lblPosicion = new JLabel("Posición");
        comboPosicion = new JComboBox<>(new String[]{"arbitro", "entrenador", "tirador", "director"});
        lblArma = new JLabel("Arma");
        comboArma = new JComboBox<>(new String[]{"sable", "espada", "florete"});
        checkSolo = new JCheckBox("Individual");
        checkGrupo = new JCheckBox("Por Equipos");
        btnSave = new JButton("Guardar");
        lblError = new JLabel();
        lblError.setForeground(Color.red);
        checkGender = new ButtonGroup();
        checkGender.add(checkHombre);
        checkGender.add(checkMujer);


        panelContenido.add(lblNombre);
        panelContenido.add(txtNombre);
        panelContenido.add(lblApellidos);
        panelContenido.add(txtApellidos);
        panelContenido.add(lblDni);
        panelContenido.add(txtDni);
        panelContenido.add(lblTelefono);
        panelContenido.add(txtTelefono);
        panelContenido.add(lblDireccion);
        panelContenido.add(txtDireccion);
        panelContenido.add(lblCP);
        panelContenido.add(txtCP);
        panelContenido.add(lblCiudad);
        panelContenido.add(txtCiudad);
        panelContenido.add(lblNFederado);
        panelContenido.add(txtNFederado);
        panelContenido.add(checkHombre);
        panelContenido.add(checkMujer);
        panelContenido.add(lblPassw);
        panelContenido.add(txtPassw);
        panelContenido.add(lblConfirmPassw);
        panelContenido.add(txtConfirmPassw);
        panelContenido.add(lblPosicion);
        panelContenido.add(comboPosicion);
        panelContenido.add(lblArma);
        panelContenido.add(comboArma);
        panelContenido.add(checkSolo);
        panelContenido.add(checkGrupo);
        add(btnSave, BorderLayout.SOUTH);

        groupLayout = new GroupLayout(panelContenido);
        panelContenido.setLayout(groupLayout);
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre)
                                .addComponent(lblApellidos)
                                .addComponent(lblDni)
                                .addComponent(lblTelefono)
                                .addComponent(lblDireccion)
                                .addComponent(lblCP)
                                .addComponent(lblCiudad)
                                .addComponent(lblNFederado)
                                .addComponent(checkHombre)
                                .addComponent(lblPassw)
                                .addComponent(lblConfirmPassw))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre)
                                .addComponent(txtApellidos)
                                .addComponent(txtDni)
                                .addComponent(txtTelefono)
                                .addComponent(txtDireccion)
                                .addComponent(txtCP)
                                .addComponent(txtCiudad)
                                .addComponent(txtNFederado)
                                .addComponent(checkMujer)
                                .addComponent(txtPassw)
                                .addComponent(txtConfirmPassw))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(lblPosicion)
                                .addComponent(lblArma)
                                .addComponent(checkSolo)
                                .addComponent(checkGrupo))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(comboPosicion)
                                .addComponent(comboArma))
        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNombre)
                                .addComponent(txtNombre)
                                .addComponent(lblPosicion)
                                .addComponent(comboPosicion))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblApellidos)
                                .addComponent(txtApellidos)
                                .addComponent(lblArma)
                                .addComponent(comboArma))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDni)
                                .addComponent(txtDni)
                                .addComponent(checkSolo))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelefono)
                                .addComponent(txtTelefono)
                                .addComponent(checkGrupo))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDireccion)
                                .addComponent(txtDireccion))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCP)
                                .addComponent(txtCP))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCiudad)
                                .addComponent(txtCiudad))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNFederado)
                                .addComponent(txtNFederado))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(checkHombre)
                                .addComponent(checkMujer))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPassw)
                                .addComponent(txtPassw))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblConfirmPassw)
                                .addComponent(txtConfirmPassw))
        );

        add(panelContenido);
        add(lblError, BorderLayout.NORTH);

        btnSave.addActionListener(e -> {
            List<Validate.Item> itemList = Validate.validateContents(txtNombre.getText(), txtApellidos.getText(), txtDni.getText(), txtTelefono.getText(),
                    txtDireccion.getText(), txtCP.getText(), txtCiudad.getText(), txtNFederado.getText(), checkGender.getSelection() != null,
                    Arrays.toString(txtPassw.getPassword()),Arrays.toString(txtConfirmPassw.getPassword()),checkSolo.isSelected(), checkGrupo.isSelected());

            if (!Validate.validateList(itemList)){
                lblError.setText(Validate.getErrors(itemList));
            } else {

            }
        });
    }




    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ej05().setVisible(true);
            }
        });
    }
}
