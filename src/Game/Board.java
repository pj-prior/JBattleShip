package Game;

import java.util.ArrayList;

/**
 * Creates the game board
 * @author pj.prior
 * @version beta 1
 * @since 13/03/2023
 */

public class Board {

    public Board(){
        readBoard(8);
    }

    public void readBoard(int cellNumber){
        for(int i = 0; i<cellNumber; i++){
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j<cellNumber; j++){
                list.add('-');
            }
            board.add(list);
        }
    }

    public static void printBoard(ArrayList<ArrayList<Character>> board){
        for(ArrayList<Character> list:board){
            System.out.println("+---+---+---+");
            for (Character character:list){
                System.out.print("| " + character + " ");
            }
            System.out.println("|");
        }
        System.out.println("+---+---+---+");
    }

    private ArrayList<ArrayList<Character>> board;

}
