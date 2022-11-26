package Ej02_BattleShip;

import java.awt.*;
import java.util.Map;

public class IntroducirBarcos {

    public static void tryPlaceShips(int angulo, Cell[][] cells, int height, int width, int shipSize, String shipType, int shipsAvailable) throws CellOccupiedException {
        Cell cell;
        try {
            for (int i = 1; i < shipSize; i++) {
                cell = getCell(angulo, cells, height, width, i, shipsAvailable);
                if (cell != null && cell.getHayBarco()) {
                    throw new CellOccupiedException("Ya hay un barco en esta celda");
                }
            }
        } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
            throw new ArrayIndexOutOfBoundsException("El barco " + shipType + " no cabe");
        } catch (CellOccupiedException occupiedException) {
            throw new CellOccupiedException(occupiedException.getMessage());
        }
    }

    public static void placeShips(boolean placeable, int angulo, Cell[][] cells, int height, int width, Map<String, Integer> availableShips, int shipSize, String shipType) {
        if (placeable && availableShips.get(shipType) != 0) {
            Cell cell = cells[height][width];
            cell.setBarco(shipType);
            cell.setBackground(Color.GRAY);
            for (int i = 1; i < shipSize; i++) {
                cell = getCell(angulo, cells, height, width, i);
                cell.setBarco(shipType);
                cell.setBackground(Color.GRAY);
            }
            availableShips.replace(shipType, availableShips.get(shipType), availableShips.get(shipType) - 1);
        }
    }

    public static void setMaxShips(Map<String, Integer> availableShips) {
        availableShips.put("Carrier", 1);
        availableShips.put("Battleship", 2);
        availableShips.put("Destroyer", 3);
        availableShips.put("Submarine", 4);
        availableShips.put("Patrol Boat", 5);
    }

    private static Cell getCell(int angulo, Cell[][] cells, int height, int width, int offset, int shipsAvailable) {
        Cell cell = null;
        int positionX, positionY;
        if (shipsAvailable != 0) {
            switch (angulo) {
                case 0 -> {
                    positionY = height - offset;
                    positionX = width;
                    cell = cells[positionY][positionX];
                }
                case 1 -> {
                    positionY = height;
                    positionX = width + offset;
                    cell = cells[positionY][positionX];
                }
                case 2 -> {
                    positionY = height + offset;
                    positionX = width;
                    cell = cells[positionY][positionX];
                }
                case 3 -> {
                    positionY = height;
                    positionX = width - offset;
                    cell = cells[positionY][positionX];
                }
            }
        }
        return cell;
    }

    private static Cell getCell(int angulo, Cell[][] cells, int height, int width, int offset) {
        Cell cell = null;
        int positionX, positionY;
        switch (angulo) {
            case 0 -> {
                positionY = height - offset;
                positionX = width;
                cell = cells[positionY][positionX];
            }
            case 1 -> {
                positionY = height;
                positionX = width + offset;
                cell = cells[positionY][positionX];
            }
            case 2 -> {
                positionY = height + offset;
                positionX = width;
                cell = cells[positionY][positionX];
            }
            case 3 -> {
                positionY = height;
                positionX = width - offset;
                cell = cells[positionY][positionX];
            }
        }
        return cell;
    }
}
