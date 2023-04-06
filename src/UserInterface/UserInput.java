package UserInterface;

import GameBoard.Board;

import java.util.*;

/**
 * @author Pere Prior
 * @version beta1
 * @since 06/04/2023
 */
public class UserInput {

    public static String readCoordinate(Board board) {
        Scanner inputValue = new Scanner(System.in);
        int row;
        int column;

        while (true) {
            System.out.print("Enter the next coordinate: ");
            String coordinate = inputValue.nextLine();
            row = getRowFromCoordinate(coordinate);
            column = getColumnFromCoordinate(coordinate);
            if (row >= 0 && row < board.getNumberOfRows() && column >= 0 && column < board.getNumberOfColumns()) {
                return coordinate;
            } else {
                System.out.println("\033[31mInvalid coordinate\033[0m");
            }
        }
    }


    static int getRowFromCoordinate(String coordinate) {
        return Integer.parseInt(coordinate.substring(1)) - 1;
    }

    static int getColumnFromCoordinate(String coordinate) {
        return coordinate.charAt(0) - 'A';
    }

}