import GameBoard.Board;
import GameBoard.BoardPrinter;
import UserInterface.Attack;
import UserInterface.UserInput;
import Utils.Utils;

/**
 * @author pj.prior
 * @version beta 1
 * @since 13/03/2023
 */

public class Main {
    public static void main(String[] args) {
        Board board = new Board(6,6);
        while (true){
            BoardPrinter.printBoard(board);
            String coordinate = UserInput.readCoordinate(board);
            Attack attack = new Attack(board);

            attack.attackCell(coordinate);
            BoardPrinter.cleanScreen();
        }
    }
}