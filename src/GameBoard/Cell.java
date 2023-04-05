package GameBoard;

/**
 * @author Pere Prior
 * @version beta1
 * @since 05/04/2023
 */
public class Cell implements ICell {
    private boolean isShip;
    private boolean isAttacked;
    private char value;

    public Cell(){
        this.value='❔';
        this.isShip=false;
        this.isAttacked=false;
    }

    @Override
    public boolean isShipCell() {
        return isShip;
    }

    @Override
    public boolean isAttacked() {
        return isAttacked;
    }

    @Override
    public void attackCell() {
        isAttacked = true;
        if (isShip) {
            value = '!';
        } else {
            value = 'X';
        }
    }

    public void setShipCell(){
        this.isShip=true;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}