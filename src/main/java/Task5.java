import java.util.Arrays;
import  static utils.LineSeparator.*;
public class Task5 {
    private static int SUM = 0;
    private static int MULTIPLICATION = 1;

    public static void main(String[] args) {
        System.out.print("Your digits: " + Arrays.toString(args) + ";" + lineSeparator());
        counterSum(args);
        counterMultiplication(args);
        System.out.println("Result sum: " + SUM + ";");
        System.out.println("Result multiplication: " + MULTIPLICATION + ";");
    }

    private static void counterSum(String[] args) {
        for (String stringArgForSum : args) {
            SUM += Integer.parseInt(stringArgForSum);
        }
    }

    private static void counterMultiplication(String[] args) {
        for (String stringArgForMul : args) {
            MULTIPLICATION *= Integer.parseInt(stringArgForMul);
        }

    }



}
