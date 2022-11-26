package Ej02_BattleShip;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Tablero extends JPanel{



    private Cell[][] cells;

    public Tablero() {
        innitComponents();
    }

    private void innitComponents() {
        setLayout(new GridLayout(10, 10, 0, 0));
        setSize(new Dimension(500, 500));
        cells = new Cell[10][10];
        char row = 'A';

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Cell label = new Cell("celda"+row+(j+1));
                label.setSize(new Dimension(50, 50));
                label.setBorder(new LineBorder(Color.BLACK));
                label.setOpaque(true);
                label.setBackground(Color.WHITE);

                cells[i][j] = label;
            }
            row++;
        }

        for (Cell[] cell : cells) {
            for (int j = 0; j < cells[0].length; j++) {
                add(cell[j]);
            }
        }
        //setSize(new Dimension(500, 550));


    }

    public Cell[][] getCells() {
        return cells;
    }


}