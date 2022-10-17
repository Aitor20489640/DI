package Ej03;

import javax.swing.*;
import java.util.List;

public class VentanaMostrar extends JFrame {
    private List<Persona> personaList;
    public VentanaMostrar(List<Persona> personaList) {
        this.personaList = personaList;
    }

    public static void removePersona(List<Persona> agenda, String nombre) {
        agenda.removeIf(p -> p.getNombre().equals(nombre));
    }
}
