package Utils;

import java.util.*;

/**
 * Creates the game board
 * @author pj.prior
 * @version beta 1
 * @since 13/03/2023
 */
public class Utils {

    public static int readInteger(String message) throws InputMismatchException {
        int number;
        while (true) {
            try {
                System.out.println(message);
                number = inputValue.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Is not a valid number");
                inputValue.nextLine();
            }

        }
        return number;

    }

    public static double readDouble(String message) throws InputMismatchException {
        double number;
        while (true) {
            try {
                System.out.println(message);
                number = inputValue.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Is not a valid number");
                inputValue.nextLine();
            }
        }
        return number;
    }

    public static String readLine(String message) throws InputMismatchException {
        System.out.println(message);
        return inputValue.nextLine();
    }

    public static List<Character> divideLineInCharacters(String message){
        List<Character> characters = new ArrayList<>();
        for(int i=0;i<message.length();i++){
            characters.add(message.charAt(i));
        }
        return characters;
    }

    private static Scanner inputValue = new Scanner(System.in).useLocale(Locale.US);

}
