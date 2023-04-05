package GameBoard;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Pere Prior
 * @version beta1
 * @since 05/04/2023
 */
public class Row {
    private ArrayList<Cell> cells = new ArrayList<>();

    public Row(int numberOfColumns){
        for(int i=0;i<numberOfColumns;i++){
            cells.add(new Cell());
        }
    }

    public void setShipInACell() {
        Random numberGenerator = new Random();
        int index = numberGenerator.nextInt(cells.size());
        cells.set(index, new ShipCell());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cells.size(); i++) {
            sb.append(cells.get(i));
            if (i != cells.size() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}