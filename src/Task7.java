import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static utils.Helper.*;
public class Task7 {
    private static List<Integer> digits = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Your digits: " + Arrays.toString(args) + ";" + lineSeparator());
        counterMethod(args);
    }

    private static boolean helper(int number) {
        int[] array = new int[10];
        Stream.of(String
                .valueOf(number).split(""))
                .forEach(digit -> array[Integer.parseInt(digit)]++);
        return Arrays.stream(array)
                .filter(digit -> digit == 1)
                .toArray().length == String.valueOf(number).length();
    }

    private static void counterMethod(String[] arguments) {
        System.out.println("Result three-digit number in decimal which is not the same recording figures: ");
        Stream.of(arguments).filter(digit -> helper(Integer.parseInt(digit))).filter(length -> length.length() != 1).forEach((elements) -> digits.add(Integer.parseInt(elements)));
        System.out.println(digits + ";");
        System.out.print("First of them: ");
        System.out.println(digits.get(0)+"");
    }


}