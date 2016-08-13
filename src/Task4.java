import java.util.Arrays;
import static utils.Helper.*;
public class Task4 {
    public static void main(String[] args) {
        System.out.print("Your digits: " + Arrays.toString(args) + ";" + lineSeparator());
        findDigitWithMinimalAmountOfDifferentSymbols(args);
    }

    private static void findDigitWithMinimalAmountOfDifferentSymbols(String[] args) {
        String finalResult = args[0];
        for (int i = 1; i < args.length; i++) {
            if (countDifferentSymbolsInDigit(finalResult) > countDifferentSymbolsInDigit(args[i])) {
                finalResult = args[i];
            }
        }
        System.out.println("Result number in which the minimum number of different figures: " + finalResult +
                "( The minimum number of recurring characters: " + countDifferentSymbolsInDigit(finalResult)
                + ")" + ".");
    }

    private static int countDifferentSymbolsInDigit(String digitString) {
        char[] digitChars = digitString.toCharArray();
        int result = 0;
        for (int i = 1; i < digitChars.length; i++) {
            if (digitChars[0] != digitChars[i] && digitChars[i] != digitChars[i - 1]) {
                result++;
            }
        }
        return result;
    }


}
