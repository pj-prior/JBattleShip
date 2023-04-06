package GameBoard;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Pere Prior
 * @version beta1
 * @since 05/04/2023
 */

public class Board {
    private final ArrayList<Row> rows = new ArrayList<>();
    private final int numberOfRows;
    private final int numberOfColumns;

    public Board(int numberOfRows, int numberOfColumns) {
        for (int i = 0; i < numberOfRows; i++) {
            rows.add(new Row(numberOfColumns));
        }
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public Cell getCell(int row, int col) {
        if (row < 0 || row >= numberOfRows || col < 0 || col >= numberOfColumns) {
            throw new IllegalArgumentException("Invalid row or column index");
        }
        Row rowObject = rows.get(row);
        return rowObject.getCell(col);
    }

    public void setShipInABoard(int numberOfShips) {
        for (int i = 0; i < numberOfShips; i++) {
            int rowIndex = getRandomRowIndex();
            Row row = rows.get(rowIndex);
            row.setShipInACell();
        }
    }

    private int getRandomRowIndex() {
        Random random = new Random();
        return random.nextInt(rows.size());
    }

    private int getRandomColumnIndex() {
        Random random = new Random();
        return random.nextInt(numberOfColumns);
    }

    public boolean isValidAttack(int row, int col) {
        Cell cell = getCell(row, col);
        return !cell.getState().equals(Cell.State.HIT) && !cell.getState().equals(Cell.State.MISS);
    }
}


