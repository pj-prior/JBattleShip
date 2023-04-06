package UserInterface;

import GameBoard.Board;
import GameBoard.Cell;
import GameBoard.ShipCell;

import static UserInterface.UserInput.getColumnFromCoordinate;
import static UserInterface.UserInput.getRowFromCoordinate;

/**
 * @author Pere Prior
 * @version beta1
 * @since 06/04/2023
 */
public class Attack {
    private final Board board;

    public Attack(Board board) {
        this.board = board;
    }

    public void attackCell(String coordinate) {
        int row = getRowFromCoordinate(coordinate);
        int col = getColumnFromCoordinate(coordinate);

        if (board.isValidAttack(row, col)) {
            Cell cell = board.getCell(row, col);
            if (cell instanceof ShipCell) {
                cell.setState(Cell.State.HIT);
            } else {
                cell.setState(Cell.State.MISS);
            }
        }
    }
}

