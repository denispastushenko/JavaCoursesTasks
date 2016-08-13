import java.util.*;
import static utils.Helper.*;

public class Task2 {
    private static Set<Integer> setReverse = new TreeSet<>(Collections.reverseOrder());
    private static Set<Integer> set = new TreeSet<>();

    public static void main(String[] args) {
        System.out.println("Your digits: " + Arrays.toString(args) + ";" + lineSeparator());
        reverseSet(args);
        sort(args);
    }

    private static void reverseSet(String[] args) {
        for (String argument : args) {
            set.add(Integer.parseInt(argument));
        }
        System.out.println("Increase: " + set + ";");
    }

    private static void sort(String[] args) {
        for (String argument : args) {
            setReverse.add(Integer.parseInt(argument));
        }
        System.out.println("Decrease: " + setReverse + ";");
    }


}
