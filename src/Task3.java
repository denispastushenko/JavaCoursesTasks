import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Program Example With "Scanner" Using */
public class Task3 {
    private static List<Integer> digitArr = new ArrayList<>();
    private static List<Double> length = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter amount: ");
        int amount = scanner.nextInt();
        System.out.println("Enter digits: ");
        fillArr(amount);
        getLength(amount);
        System.out.println("Length of Array elements: " + length + ";");
        fillCollWithElem(amount);
    }

    private static void fillArr(int amount) {
        for (Integer i = 0; i < amount; i++) {
            digitArr.add(scanner.nextInt());
        }
    }

    private static void getLength(int amount) {
        System.out.println();
        double lengthStr;
        for (Integer i = 0; i < amount; i++) {
            lengthStr = Integer.toString(digitArr.get(i)).length();
            length.add(lengthStr);
        }
    }

    private static double sums() {
        double sum = 0, halfSum;
        for (Double double_ : length) {
            sum += double_;
        }
        halfSum = sum / 2;
        return halfSum;
    }

    private static void fillCollWithElem(int amount) {
        List<String> moreThem = new ArrayList<>();
        List<String> lowerThen = new ArrayList<>();

        for (Integer i = 0; i < amount; i++) {
            String string = Integer.toString(digitArr.get(i));
            if (string.length() > sums()) {
                moreThem.add(" Digit = " + string + "; Length: " + string.length() + "; ");
            } else if (string.length() < sums()) {
                lowerThen.add(" Digit = " + string + "; Length: " + string.length() + "; ");
            }
        }
        System.out.println("HalfSum :" + sums() + ";");
        System.out.println("More then Half Sum = " + moreThem + ";");
        System.out.println("Lower then Half Sum = " + lowerThen + ";");
    }
}
