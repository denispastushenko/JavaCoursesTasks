import java.util.Arrays;
import static utils.Helper.*;
public class Task9_1 {
    public static void main(String[] args) {
        int[][] array = new int[Integer.parseInt(args[0])][Integer.parseInt(args[0])];
        fillMatrix(array);
        sortArrayByRows(array);
    }

    private static void sortArrayByRows(int array[][]){
        for (int row[]: array) {
            Arrays.sort(row);
        }
        System.out.println("Sorted matrix: ");
        matrixView(array);
    }
}
