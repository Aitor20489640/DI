package Ej02_BattleShip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPonerBarcos extends JFrame{
    private JLabel lblExit;
    private JPanel panelDatos;
    private JTextField txtPlayerName;
    private JComboBox<String> shipList;
    private JPanel panelBarcos;
    private JLabel lblPlayerName;
    private JLabel lblShips;
    private JLabel shipSize;
    private JButton btnSave;
    private JLabel lblShipSize;

    private Tablero board;

    private void createUIComponents() {
        board = new Tablero();
        panelBarcos = board;
    }

    public VentanaPonerBarcos() {
        setSize(700, 700);
        add(panelDatos);

        panelBarcos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point position = panelBarcos.getMousePosition();
                int heigth = (int) position.getY();
                int width = (int) position.getX();

                heigth /= 50;
                width /= 50;

                Cell[][] cells = board.getCells();

                Cell cell = cells[heigth][width];

                System.out.println(cell.getName());
            }
        });

        shipList.addActionListener(a -> {
            switch (shipList.getSelectedIndex()) {
                case 0 -> shipSize.setText("5");
                case 1 -> shipSize.setText("4");
                case 2, 3 -> shipSize.setText("3");
                case 4 -> shipSize.setText("2");

            }
        });
    }
}
