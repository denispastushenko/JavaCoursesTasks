package utils;


import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Helper {

    public static String lineSeparator() {
        return System.getProperty("line.separator");
    }

    public static void matrixView(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%3s", arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void fillMatrix(int[][] array) {

        System.out.println("One view way: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(-5, 5);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println(lineSeparator()+"Another view way: ");
        matrixView(array);
    }

}
