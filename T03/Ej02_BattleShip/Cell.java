package Ej02_BattleShip;

import javax.swing.*;

public class Cell extends JLabel {
    boolean hayBarco;
    String contenido;

    public Cell(){
        this.hayBarco = false;
        this.contenido = "Agua";
    }


    public void setBarco(String barco) {
        this.hayBarco = true;
        this.contenido = barco;
    }

}
