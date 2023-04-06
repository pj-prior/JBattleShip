package GameBoard;

import UserInterface.UserInput;
import Utils.Utils;

public class BoardPrinter {
    private static final String COLUMN_SEPARATOR = " | ";
    private static final String ROW_SEPARATOR = System.lineSeparator();
    private static final String HEADER_ROW_START = "  | ";
    private static final String HEADER_ROW_END = ROW_SEPARATOR;
    private static final String NUMBER_FORMAT = "%2d";

    public static void printBoard(Board board) {
        int numberOfRows = board.getNumberOfRows();
        int numberOfColumns = board.getNumberOfColumns();
        StringBuilder sb = new StringBuilder();

        sb.append("     ");
        for (int column = 0; column < numberOfColumns; column++) {
            char columnChar = (char) ('A' + column);
            sb.append(String.format("%s   ", columnChar));
        }
        sb.append(HEADER_ROW_END);

        for (int row = 0; row < numberOfRows; row++) {
            sb.append(String.format(NUMBER_FORMAT + " |", row + 1));
            for (int col = 0; col < numberOfColumns; col++) {
                Cell cell = board.getCell(row, col);
                sb.append(" ").append(cell).append(" |");
            }
            sb.append(ROW_SEPARATOR);
        }
        cleanScreen();
        System.out.print(sb.toString());
    }

    public static void cleanScreen() {
        for (int x = 0; x < 50; x++) {
            System.out.println(" ");
        }
    }
}
