import static utils.Helper.*;

public class Task8 {
    private static int array[][] = new int[5][5];

    public static void main(String[] args) {
        matrixPrintLine(array);
        matrixPrintDown(array);
    }

    private static void matrixPrintLine(int[][] arr) {
        int counter = 1;
        System.out.println("Your matrix line: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = counter++;
            }
        }
        matrixView(arr);
    }

    private static void matrixPrintDown(int[][] arr) {
        int counter = 1;
        System.out.println("Your matrix down: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j][i] = counter++;
            }
        }
        matrixView(arr);
    }


}