import java.util.Arrays;
import static utils.Helper.fillMatrix;

public class Task9_5 {
    public static void main(String[] args) {
        int[][] array = new int[Integer.parseInt(args[0])][Integer.parseInt(args[0])];
        fillMatrix(array);

        System.out.println("Matrix 90");
        System.out.println(Arrays.deepToString(turnMatrix90(array)));
        System.out.println("Matrix 180 ");
        System.out.println(Arrays.deepToString(turnMatrix180(array)));
        System.out.println("Matrix 270 ");
        System.out.println(Arrays.deepToString(turnMatrix270(array)));
    }
    private static int[][] turnMatrix270(int array[][]) {
        int changedArr[][] = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++)
            for (int j = array.length - 1, x = 0; j >= 0 && x < array.length; j--, x++)
                changedArr[i][x] = array[j][i];
        return changedArr;
    }


    private static int[][] turnMatrix180(int array[][]) {
        int changedArr[][] = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                changedArr[i][j] = array[array.length - 1 - i][array.length - 1 - j];
        return changedArr;
    }

    private static int[][] turnMatrix90(int array[][]) {
        return turnMatrix180(turnMatrix270(array));
    }


}

