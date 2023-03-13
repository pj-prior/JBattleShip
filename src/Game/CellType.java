package Game;

/**
 * Creates the game board
 * @author pj.prior
 * @version beta 1
 * @since 13/03/2023
 */

public enum CellType {
    BOARD('❗'),
    WATER('❌'),
    CELL('❔'),
    HELP('❓');

    CellType(char c) {
        this.content=c;
    }

    public char getContent(){
        return content;
    }

    private final char content;
}
