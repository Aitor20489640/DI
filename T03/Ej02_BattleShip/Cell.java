package Ej02_BattleShip;

import javax.swing.*;

public class Cell extends JLabel {
    private boolean hayBarco;
    private String contenido;

    public Cell(String name){
        setName(name);
        this.hayBarco = false;
        this.contenido = "Agua";
    }


    public void setBarco(String barco) {
        this.hayBarco = true;
        this.contenido = barco;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setAgua(){
        this.hayBarco = false;
        this.contenido = "Agua";
    }

    public boolean getHayBarco() {
        return hayBarco;
    }
}
