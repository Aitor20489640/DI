package Ej03;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class VentanaAdd extends JFrame {
    private List<Persona> personaList;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblEmail;
    private JTextField formatTxtEmail;
    private JLabel lblFecha;
    private JTextField txtFecha;
    private JPanel JPaneText;
    public VentanaAdd (List<Persona> personaList) {
        this.personaList = personaList;
        innitComponents();
    }

    private void innitComponents() {
        setLayout(new BorderLayout());

    }





    public static Persona crearPersona() {
        Scanner sc = new Scanner(System.in);
        String nombre, email, date;
        Persona p = null;

        System.out.print("Escribe el nombre de la persona: ");
        nombre = sc.nextLine();
        System.out.print("Escribe el email de la persona: ");
        email = sc.nextLine();
        System.out.print("Escribe la fecha de nacimiento(yyyy-mm-dd): ");
        date = sc.nextLine();

        try {
            p = new Persona(nombre, email, date);
        }
        catch (FormatException e) {
            e.printStackTrace();
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
}

