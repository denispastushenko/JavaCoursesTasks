import java.util.*;
import  static utils.LineSeparator.*;

public class Task6_1 {
    private static List<Integer> DIGITS = new ArrayList<>();

    public static void main(String[] args) {
        for (String argument : args) {
            DIGITS.add(Integer.parseInt(argument));
        }
        System.out.print("Your digits: " + Arrays.toString(args) + ";" + lineSeparator());
        digitCheck();
    }



    private static void digitCheck() {
        SortedSet<Integer> unpaired = new TreeSet<>();
        SortedSet<Integer> pair = new TreeSet<>();
        Set<Integer> canNotDeterminate = new HashSet<>();
        for (Integer integer = 0; integer < DIGITS.size(); integer++) {
            if (DIGITS.get(integer) % 2 == 0 && DIGITS.get(integer) != 0) {
                pair.add(DIGITS.get(integer));
            } else if (DIGITS.get(integer) % 2 != 0) {
                unpaired.add(DIGITS.get(integer));
            }
           else if (DIGITS.get(integer) == 0) {
                canNotDeterminate.add(DIGITS.get(integer));
            }
        }
        System.out.println("Unpaired digits: " + unpaired + ";");
        System.out.println("Pair Digits:" + pair + ";");
        System.out.println("Can not Determinate:" + canNotDeterminate + ";");
    }
}
