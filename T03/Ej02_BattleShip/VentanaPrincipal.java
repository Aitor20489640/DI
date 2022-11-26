package Ej02_BattleShip;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class VentanaPrincipal extends JFrame{
    private JPanel panelPrincipal;
    private JButton placeButton;
    private JButton salirButton;
    private JLabel lblTitle;
    private JButton startButton;
    private Tablero player1Board = new Tablero();
    private Tablero player2Board;
    private Map<String, Integer> availableShipsP1 = new HashMap<>();
    private String[] playerName = new String[1];

    public VentanaPrincipal()   {
        add(panelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(500,500));
        setLocationRelativeTo(null);
        startButton.setEnabled(true);

        IntroducirBarcos.setMaxShips(availableShipsP1);

        placeButton.addActionListener(a -> new VentanaPonerBarcos(player1Board, availableShipsP1, playerName).setVisible(true));

        /*startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                int cont = 0;
                for (int i = 0; i < availableShipsP1.size(); i++){
                    cont += availableShipsP1.values().iterator().next();
                }
                if (cont == 0){
                    startButton.setEnabled(true);
                }
            }
        });*/

        startButton.addActionListener(a -> {
            player2Board = new Tablero();

            Thread tableroEnemigo = new Thread(() -> {
                Boolean ok;
                Map<String, Integer> availableShipsP2 = new HashMap<>();
                Cell[][] cells = player2Board.getCells();
                IntroducirBarcos.setMaxShips(availableShipsP2);
                do {
                    ok = createEnemyBoard(cells, 5, "Carrier", availableShipsP2);
                }while (!ok);
                do {
                    ok = createEnemyBoard(cells, 4, "Battleship", availableShipsP2);
                }while (!ok);
                do {
                    ok = createEnemyBoard(cells, 3, "Destroyer", availableShipsP2);
                }while (!ok);
                do {
                    ok = createEnemyBoard(cells, 3, "Submarine", availableShipsP2);
                }while (!ok);
                do {
                    ok = createEnemyBoard(cells, 2, "Patrol Boat", availableShipsP2);
                }while (!ok);
            });
            try {
                tableroEnemigo.start();
                tableroEnemigo.join();
                for (Cell[] cells : player2Board.getCells()){
                    for (Cell cell : cells) {
                        cell.setBackground(Color.WHITE);
                    }
                }
                new VentanaPartida(player1Board, player2Board, playerName[0]).setVisible(true);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        salirButton.addActionListener(a -> System.exit(0));
    }

    public Boolean createEnemyBoard(Cell[][] cells, int shipSize, String shipType, Map<String, Integer> availableShips){
        boolean noIntroducir = true;
        int height, width, angulo, cont = 0;

        while (availableShips.get(shipType) != 0 && cont < 100) {
            angulo = (int) (Math.random() * 4);
            height = (int) (Math.random() * 10);
            width = (int) (Math.random() * 10);
            try {
                IntroducirBarcos.tryPlaceShips(angulo, cells, height, width, shipSize, shipType, availableShips.get(shipType));
            } catch (ArrayIndexOutOfBoundsException | CellOccupiedException boundsException) {
                noIntroducir = false;
            }
            IntroducirBarcos.placeShips(noIntroducir, angulo, cells, height, width, availableShips, shipSize, shipType);
            cont++;
        }
        return noIntroducir;
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }
}
