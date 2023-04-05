package GameBoard;

/**
 * @author Pere Prior
 * @version beta1
 * @since 05/04/2023
 */
public interface ICell {
    boolean isShipCell();
    boolean isAttacked();
    void attackCell();
}
