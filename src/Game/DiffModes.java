package Game;
import static Util.Utils.*;

/**
 * Changes the game mode
 * @author pj.prior
 * @version beta 1
 * @since 13/03/2023
 */

public class DiffModes {

    public void modePick(){
        boolean goodPick=false;
        int pick=readInteger("Game Modes:\n" + "1. Noob mode\n" + "2. Normal mode\n" + "3. Pro mode\n" + "4. Hell mode");

        while (!goodPick){
            switch (pick){
                case 1:
                    noobMode();
                    goodPick=true;
                    break;
                case 2:
                    normalMode();
                    goodPick=true;
                    break;
                case 3:
                    proMode();
                    goodPick=true;
                    break;
                case 4:
                    hellMode();
                    goodPick=true;
                    break;
                default:
                    pick=readInteger("Please, enter a valid option[1-4]:");
            }
        }

    }

    private static void noobMode(){
        cellNumber=6;
    }

    private static void normalMode(){
        cellNumber=8;
    }

    private static void proMode(){
        cellNumber=10;
    }

    private static void hellMode(){
        cellNumber=15;
    }

    private static int cellNumber;
    private static int shipNumber;

}
