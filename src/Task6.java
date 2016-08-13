import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.Helper.*;

public class Task6 {

    public static void main(String[] args) throws IOException {
        List<Integer> digits = new ArrayList<>();
        System.out.print("Your digits: " + Arrays.toString(args) + ";" + lineSeparator());
        System.out.print("Result the number of digits which are strictly in ascending order: ");
        Arrays.stream(args)
                .filter(Task6::isValid)
                .forEach((elements) -> digits.add(Integer.parseInt(elements)));
        System.out.println(digits + ";");
        System.out.println("First of them: " + digits.get(0) + ";");
    }

    private static boolean isValid(String num) {
        String[] numbers = String.valueOf(num).split("");
        int amount = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (Integer.parseInt(numbers[i]) < Integer.parseInt(numbers[i + 1])
                    && Integer.parseInt(numbers[i + 1]) - Integer.parseInt(numbers[i]) == 1)
                amount++;
        }
        return numbers.length == amount;
    }


}