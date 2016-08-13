import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static utils.Helper.*;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>();
        List<Integer> digitsAnother = new ArrayList<>();
        System.out.print("Your digits: " + Arrays.toString(args) + ";" + lineSeparator());
        System.out.print("Result the number of digits which just pair: ");
        Arrays.stream(args)
                .filter(Task5::isValid)
                .forEach(elements -> digits.add(Integer.parseInt(elements)));
        System.out.println(digits + ";");
        System.out.println("Their amount: " + digits.size() + ";");
        System.out.print("Result the number of digits which amount pair = amount unpaired: ");
        Arrays.stream(args)
                .filter(Task5::isValidAnotherCheckDigit)
                .forEach(elements -> digitsAnother.add(Integer.parseInt(elements)));
        System.out.println(digitsAnother + ";");
        System.out.println("Their amount: " + digitsAnother.size() + ";");
    }

    private static boolean isValid(String num) {
        String[] numbers = String.valueOf(num).split("");
        int amount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (Integer.parseInt(numbers[i]) % 2 == 0) {
                amount++;
            }
        }
        return numbers.length == amount;
    }

    private static boolean isValidAnotherCheckDigit(String num) {
        String[] numbers = String.valueOf(num).split("");
        int amount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (Integer.parseInt(numbers[i]) % 2 != 0)
                amount++;
        }
        return numbers.length - amount == amount;
    }


}
