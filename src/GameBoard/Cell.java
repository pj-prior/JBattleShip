package GameBoard;

/**
 * @author Pere Prior
 * @version beta1
 * @since 05/04/2023
 */
public class Cell {
    public enum State {
        EMPTY,
        SHIP,
        HIT,
        MISS
    }

    private State state;

    public Cell(State state) {
        this.state = state;
    }

    public void setState(State state){
        this.state=state;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        switch (state) {
            case HIT:
                return "\033[32mX\033[0m";
            case MISS:
                return "\033[31mX\033[0m";
            default:
                return " ";
        }
    }
}