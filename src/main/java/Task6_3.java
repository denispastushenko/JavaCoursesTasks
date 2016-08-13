import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import  static utils.LineSeparator.*;

public class Task6_3 {
    private static List<Integer> DIGITS = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Your digits: " + Arrays.toString(args) + ";" + lineSeparator());
        for (String argument : args) {
            DIGITS.add(Integer.parseInt(argument));
        }
        counter();
    }



    private static void counter() {
        List<Integer> dividedOnThree = new ArrayList<>();
        List<Integer> dividedOnNine = new ArrayList<>();
        List<Integer> canNotDeterminate = new ArrayList<>();
        for (Integer digit : DIGITS) {
            if (digit % 3 == 0 && digit != 0) {
                dividedOnThree.add(digit);
            }
            if (digit % 9 == 0 && digit != 0) {
                dividedOnNine.add(digit);
            } else if (digit == 0) {
                canNotDeterminate.add(digit);
                System.out.println("Can not determinate digit: " + canNotDeterminate + ";");
            }
        }
        System.out.println("Divided On Three: " + dividedOnThree + ";");
        System.out.println("Divided On Nine: " + dividedOnNine + ";");
    }
}
