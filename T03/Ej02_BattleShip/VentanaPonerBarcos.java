package Ej02_BattleShip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;

public class VentanaPonerBarcos extends JFrame {
    private JPanel panelDatos;
    private JTextField txtPlayerName;
    private JComboBox<String> shipList;
    private JPanel panelBarcos;
    private JLabel lblPlayerName;
    private JLabel lblShips;
    private JLabel shipSize;
    private JLabel lblShipSize;
    private JButton btnExit;
    private JLabel lblShipAvailable;
    private JLabel shipAvailable;

    private Tablero board;

    private final String[] posiciones = {"NORTH", "EAST", "SOUTH", "WEST"};

    private Map<String, Integer> availableShips;

    private String[] playerName;

    private void createUIComponents() {
        panelBarcos = board;
    }

    public VentanaPonerBarcos(Tablero board, Map<String, Integer> availableShipsP1, String[] playerName) {
        availableShips = availableShipsP1;
        this.board = board;
        setSize(800, 700);
        add(panelDatos);
        this.playerName = playerName;



        panelBarcos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                boolean noIntroducir = true;
                Point position = panelBarcos.getMousePosition();
                int height = (int) position.getY();
                int width = (int) position.getX();

                height /= 50;
                width /= 50;

                Cell[][] cells = board.getCells();
                if (!cells[height][width].getHayBarco() && availableShips.get((String) shipList.getSelectedItem()) != 0) {
                    int angulo = JOptionPane.showOptionDialog(null, "Como quieres poner el " + shipList.getSelectedItem(), "Poner el barco", JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, posiciones, posiciones[0]);

                    if (angulo != -1) {
                        try {
                            IntroducirBarcos.tryPlaceShips(angulo, cells, height, width, Integer.parseInt(shipSize.getText()), (String) shipList.getSelectedItem(), availableShips.get((String) shipList.getSelectedItem()));
                        } catch (ArrayIndexOutOfBoundsException boundsException) {
                            JOptionPane.showMessageDialog(null, boundsException.getMessage(), "Error: no cabe", JOptionPane.ERROR_MESSAGE);
                            noIntroducir = false;
                        } catch (CellOccupiedException occupiedException) {
                            JOptionPane.showMessageDialog(null, occupiedException.getMessage(), "Error: celda ocupada", JOptionPane.ERROR_MESSAGE);
                            noIntroducir = false;
                        }
                        IntroducirBarcos.placeShips(noIntroducir, angulo, cells, height, width, availableShips, Integer.parseInt(shipSize.getText()), (String) shipList.getSelectedItem());
                        shipAvailable.setText(String.valueOf(availableShips.get((String) shipList.getSelectedItem())));
                    }
                }

        }});

        shipList.addActionListener(a -> {
            switch (shipList.getSelectedIndex()) {
                case 0 -> shipSize.setText("5");
                case 1 -> shipSize.setText("4");
                case 2, 3 -> shipSize.setText("3");
                case 4 -> shipSize.setText("2");
            }
            shipAvailable.setText(String.valueOf(availableShips.get((String) shipList.getSelectedItem())));
        });

        btnExit.addActionListener(e -> {
            playerName[0] = txtPlayerName.getText();
            dispose();
        });
    }
}
