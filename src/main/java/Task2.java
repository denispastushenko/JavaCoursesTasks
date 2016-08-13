import java.util.*;
import  static utils.LineSeparator.*;
public class Task2 {
    private static List<String> List = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Arguments: " + Arrays.toString(args) + ";" + lineSeparator());
        for (String argument : args) {
            List.add(argument);
        }
        reverse();
    }

    private static void reverse() {
        Collections.reverse(List);
        System.out.print("Result: " + List + ";");
    }


}


