import java.util.Arrays;
import  static utils.LineSeparator.*;

public class Task6_7 {
    public static void main(String[] args) {
        int[] digits = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            digits[i] = Integer.parseInt(args[i]);
        }
        System.out.print("Your Digits: " + Arrays.toString(digits) + ";" + lineSeparator());
        System.out.println("Result Elements that are equal to half the sum of neighboring elements: ");
        counter(digits);
    }

    private static void counter(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i + 1] == (array[i] + array[i + 2]) / 2) {
                System.out.print(" " + array[i + 1]);
            }
        }
    }


}
