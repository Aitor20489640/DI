package Ej03;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class VentanaSeek extends JFrame {
    private List<Persona> personaList;

    public VentanaSeek(List<Persona> personaList) {
        this.personaList = personaList;
    }

    private void innitComponents(){

    }


    public static Persona buscarPersona(List<Persona> agenda) {
        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.println("Dime el nombre de la persona: ");
        nombre = sc.nextLine();

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
