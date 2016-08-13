import java.util.*;
import static utils.Helper.*;
public class Task1 {

    private static List<Integer> digitArr = new ArrayList<>();
    private static List<Integer> length = new ArrayList<>();
    private static SortedSet<String> lengthFinalForMin = new TreeSet<>();
    private static SortedSet<String> lengthFinal1ForMax = new TreeSet<>();

    public static void main(String[] args) {
        fillArrUDigits(args);
        getNumbersLength();
        getNumbers();
        System.out.println(" Max length Digits:");
        System.out.println(" Result = " + lengthFinalForMin + ";");
        System.out.println(" Min length Digits:");
        System.out.println(" Result = " + lengthFinal1ForMax + ";");
    }



    private static void fillArrUDigits(String[] args) {
        System.out.println("Your digits: " + Arrays.toString(args) + ";" + lineSeparator());
        for (String argument : args) {
            digitArr.add(Integer.parseInt(argument));
        }
    }
    private static void getNumbersLength() {
        int lengthStr;
        for (Integer digit : digitArr) {
            lengthStr = Integer.toString(digit).length();
            length.add(lengthStr);
        }
    }

    private static void getNumbers() {
        String string;
        Integer max = Collections.max(length);
        Integer min = Collections.min(length);

        for (Integer digit : digitArr) {
            string = Integer.toString(digit);
            if (string.length() == max) {
                lengthFinalForMin.add(string);
            }
            if (string.length() == min) {
                lengthFinal1ForMax.add(string);
            }
        }
        System.out.println(" Max length :" + max + ";");
        System.out.println(" Min length :" + min + ";");
    }
}
