package GameBoard;

/**
 * @author Pere Prior
 * @version beta1
 * @since 05/04/2023
 */
public class ShipCell extends Cell {
    public ShipCell(State state) {
        super(state);
    }

    @Override
    public String toString() {
        switch (getState()) {
            case HIT:
                return "X";
            case MISS:
                return "-";
            default:
                return "S";
        }
    }
}

