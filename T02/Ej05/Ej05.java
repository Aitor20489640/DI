package Ej05;

import Ej03.Ej03;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;
import java.util.Arrays;

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
    private MaskFormatter maskDni;


    public Ej05() {
        innitComponents();
    }

    public void innitComponents() {
        try {
            maskDni = new MaskFormatter("#########");
        } catch(ParseException ex) {
            ex.printStackTrace();
        }
        setSize(new Dimension(600, 600));
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
        txtTelefono = new JFormattedTextField(maskDni);
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
