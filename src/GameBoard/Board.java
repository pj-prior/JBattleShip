package GameBoard;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Pere Prior
 * @version beta1
 * @since 05/04/2023
 */
public class Board {
    private ArrayList<Row> rows = new ArrayList<>();

    public Board(int numberOfRows, int numberOfColumns) {
        for (int i = 0; i < numberOfRows; i++) {
            rows.add(new Row(numberOfColumns));
        }
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Row row : rows) {
            sb.append(row.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
