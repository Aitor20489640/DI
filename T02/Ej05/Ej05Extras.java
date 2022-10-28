package Ej05;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej05Extras extends JFrame {

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
    private JRadioButton rBtnHombre;
    private JRadioButton rBtnMujer;
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


    public Ej05Extras() {
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
        rBtnHombre = new JRadioButton("Hombre");
        rBtnMujer = new JRadioButton("Mujer");
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
        rBtnHombre.setActionCommand("Hombre");
        rBtnMujer.setActionCommand("Mujer");
        checkGender = new ButtonGroup();
        checkGender.add(rBtnHombre);
        checkGender.add(rBtnMujer);


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
        panelContenido.add(rBtnHombre);
        panelContenido.add(rBtnMujer);
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
                                .addComponent(rBtnHombre)
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
                                .addComponent(rBtnMujer)
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
                                .addComponent(rBtnHombre)
                                .addComponent(rBtnMujer))
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
            List<Item> itemList = ValidateExtras.validateContents(txtNombre.getText(), txtApellidos.getText(), txtDni.getText(), txtTelefono.getText(), txtDireccion.getText(),
                    txtCP.getText(), txtCiudad.getText(), txtNFederado.getText(), checkGender.getSelection() != null,
                    txtPassw.getPassword(),txtConfirmPassw.getPassword(),checkSolo.isSelected(), checkGrupo.isSelected());

            if (!ValidateExtras.validateList(itemList)){
                lblError.setText(ValidateExtras.getErrors(itemList));
            } else {
                lblError.setText("");

                writeFile(txtNombre.getText(), txtApellidos.getText(), txtDni.getText(), txtTelefono.getText(), txtDireccion.getText(),
                        txtCP.getText(), txtCiudad.getText(), txtNFederado.getText(), checkGender.getSelection().getActionCommand(),
                        txtPassw.getPassword(), comboPosicion.getSelectedItem().toString(), comboArma.getSelectedItem().toString(), checkSolo.isSelected(), checkGrupo.isSelected());
            }
        });
    }

    public void writeFile(String nombre, String apellido, String dni, String telefono, String direccion,
                          String cp, String ciudad, String nFederado, String gender, char[] passwd, String posicion, String arma, boolean solo, boolean grupo){

        Path ruta = Path.of("T02/Ej05/participantes.csv");
        String defineCsv = "nombre,apellido,dni,telefono,direccion,codigoPostal,ciudad,nFederado,genero,contraseña,posicion,arma,individual,grupal";
        List<String> listaCsv = new ArrayList<>();

        if (!Files.exists(ruta)){
            try {
                Files.createFile(ruta);
                Files.writeString(ruta, defineCsv);
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
        listaCsv.add(nombre);
        listaCsv.add(apellido);
        listaCsv.add(dni);
        listaCsv.add(telefono);
        listaCsv.add(direccion);
        listaCsv.add(cp);
        listaCsv.add(ciudad);
        listaCsv.add(nFederado);
        listaCsv.add(gender);
        listaCsv.add(charArrayToString(passwd));
        listaCsv.add(posicion);
        listaCsv.add(arma);
        listaCsv.add(String.valueOf(solo));
        listaCsv.add(String.valueOf(grupo));

        try {
            Files.writeString(ruta, "\n", StandardOpenOption.APPEND);
            Files.write(ruta, String.join(",", listaCsv).getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String charArrayToString(char[] vector){
        int length = Arrays.toString(vector).length();
        return Arrays.toString(vector).substring(1, length - 1).replaceAll(" ", "").replaceAll(",", "");
    }




    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Ej05Extras().setVisible(true));
    }
}
