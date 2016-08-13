import java.util.*;
import  static utils.LineSeparator.*;

public class Task6_2 {
    private static List<Integer> DIGITS = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Your digits: " + Arrays.toString(args) + ";" + lineSeparator());
        for (String argument : args) {
            DIGITS.add(Integer.parseInt(argument));
        }
        maxMin();
    }



    private static void maxMin() {
        Integer max = Collections.max(DIGITS);
        Integer min = Collections.min(DIGITS);
        System.out.println("Max element: " + max + ";");
        System.out.println("Min element: " + min + ";");
    }
}

