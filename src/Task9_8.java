import java.util.Arrays;

import static utils.Helper.fillMatrix;

public class Task9_8 {
    public static void main(String[] args) {
        int[][] array = new int[Integer.parseInt(args[0])][Integer.parseInt(args[0])];
        fillMatrix(array);
        System.out.println("Result: ");
        System.out.println(Arrays.deepToString(zeroInTheEndOfLine(array)) + ";");
    }

    private static int[][] zeroInTheEndOfLine(int array[][]) {
        for (int row[] : array) {
            int counter = 0;
            for (int i = 0; i < row.length; i++) {
                if (row[i] != 0)
                    row[counter++] = row[i];
            }
            for (; counter < row.length; )
                row[counter++] = 0;
        }
        return array;
    }
}
