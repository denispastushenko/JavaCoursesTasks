import java.util.ArrayList;
import java.util.List;

import static utils.Helper.*;

public class Task9_6 {
    public static void main(String[] args) {
        int[][] array = new int[Integer.parseInt(args[0])][Integer.parseInt(args[0])];
        fillMatrix(array);
        halfOfTheLineSum(array);
    }

    private static void halfOfTheLineSum(int array[][]) {
        List<Double> result = new ArrayList<>();
        for (int arr[] : array) {
            double halfSum = 0;
            for (int element : arr) {
                if (element < 0)
                    element *= (-1);
                halfSum += element;
            }
            halfSum = halfSum / arr.length;
            result.add(halfSum);

        }
        System.out.println(lineSeparator() + "Result Matrix Rows 1 Col 5: ");
        System.out.println((result));
    }
}
