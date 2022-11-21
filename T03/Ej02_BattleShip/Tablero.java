package Ej02_BattleShip;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
                Cell label = new Cell();
                label.setName("celda"+row+(j+1));
                label.setSize(new Dimension(50, 50));
                label.setBorder(new LineBorder(Color.BLACK));

                cells[i][j] = label;
            }
            row++;
        }

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                add(cells[i][j]);
            }
        }
        //setSize(new Dimension(500, 550));

        /*addMouseListener(new CustomMouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                Point position = getMousePosition();
                int heigth = (int) position.getX();
                int width = (int) position.getY();

                System.out.println("h " + heigth + " w " + width);

                heigth /= 50;
                width /= 50;

                Cell cell = cells[width][heigth];

                System.out.println(cell.getName());
            }
        });*/

    }

    public Cell[][] getCells() {
        return cells;
    }


}