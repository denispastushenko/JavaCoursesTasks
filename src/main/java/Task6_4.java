import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import  static utils.LineSeparator.*;

public class Task6_4 {
    private static List<Integer> DIGITS = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Your digits: " + Arrays.toString(args) + ";" + lineSeparator());
        for (String argument : args) {
            DIGITS.add(Integer.parseInt(argument));
        }
        dividedOnFiveAndSeven();
    }



    private static void dividedOnFiveAndSeven() {
        List<Integer> dividedOnFiveAndSeven = new ArrayList<>();
        List<Integer> canNotDeterminate = new ArrayList<>();
        for (Integer dividedOn : DIGITS) {
            if (dividedOn % 5 == 0 && dividedOn % 7 == 0 && dividedOn != 0) {
                dividedOnFiveAndSeven.add(dividedOn);
            } else if (dividedOn == 0) {
                canNotDeterminate.add(dividedOn);
                System.out.println("Can not determinate digit: " + canNotDeterminate + ";");
            }
        }
        System.out.println("Divided On Seven And Five: " + dividedOnFiveAndSeven + ";");

    }
}

