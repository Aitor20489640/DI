package Ej02_BattleShip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPartida extends JFrame{
    private JPanel panelPrincipal;
    private JLabel playerName;
    private JLabel lblAttack;
    private JLabel lblMyShips;
    private JLabel numberTurns;
    private JLabel lblTurns;
    private JLabel lblPlayerName;
    private JPanel panelAttack;
    private JPanel panelMyShips;
    private JButton btnAttack;
    private Tablero p1Board;
    private Tablero p2Board;
    private int turns;

    public VentanaPartida(Tablero p1Board, Tablero p2Board, String playerName) {
        this.p1Board = p1Board;
        this.p2Board = p2Board;
        setSize(new Dimension(1030, 700));
        add(panelPrincipal);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.playerName.setText(playerName);

        panelAttack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point position = panelAttack.getMousePosition();
                int height = (int) position.getY();
                int width = (int) position.getX();

                height /= 50;
                width /= 50;

                Cell[][] cells = p2Board.getCells();

                System.out.println(cells[height][width].getContenido());
            }
        });




    }

    private void createUIComponents() {
        panelMyShips = p1Board;
        panelAttack = p2Board;
    }
}
