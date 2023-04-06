package GameBoard;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Pere Prior
 * @version beta1
 * @since 05/04/2023
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Row {
    private final ArrayList<Cell> cells = new ArrayList<>();

    public Row(int numberOfColumns){
        List<Cell.State> states = new ArrayList<>();
        for(int i=0;i<numberOfColumns;i++){
            states.add(Cell.State.EMPTY);
        }
        setCells(states);
    }

    public void setShipInACell() {
        Random numberGenerator = new Random();
        int index = numberGenerator.nextInt(cells.size());
        cells.set(index, new ShipCell(Cell.State.SHIP));
    }

    public Cell getCell(int column) {
        return cells.get(column);
    }

    public void setCells(List<Cell.State> states) {
        cells.clear();
        for (Cell.State state : states) {
            if (state == Cell.State.SHIP) {
                cells.add(new ShipCell(state));
            } else {
                cells.add(new Cell(state));
            }
        }
    }

    public List<Cell.State> getCellStates() {
        List<Cell.State> states = new ArrayList<>();
        for (Cell cell : cells) {
            states.add(cell.getState());
        }
        return states;
    }
}