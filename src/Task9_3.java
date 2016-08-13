import java.util.Arrays;
import static utils.Helper.fillMatrix;

public class Task9_3 {
    public static void main(String[] args) {
        int[][] array = new int[Integer.parseInt(args[0])][Integer.parseInt(args[0])];
        fillMatrix(array);
        counterOfSequence(array);
    }


    private static void counterOfSequence(int[][] arr) {
        int[] oneLineMatrix = new int[arr.length * arr.length];
        int count = 0, increase = 0, max = 0, amountToHigh = 0, decrease = 0, min = 0, amountToLow = 0;
        for (int[] oneLineArray : arr) {
            for (int digits : oneLineArray) {
                oneLineMatrix[count++] = digits;
            }
        }
        for (int i = 0; i < oneLineMatrix.length - 1; i++) {
            if (oneLineMatrix[i] < oneLineMatrix[i + 1]) {
                increase += 1;
                if (increase > max) {
                    max = increase;
                    amountToHigh = i + 1;
                }
            } else {
                increase = 0;
            }
            if (oneLineMatrix[i] > oneLineMatrix[i + 1]) {
                decrease += 1;
                if (decrease > min) {
                    min = decrease;
                    amountToLow = i + 1;
                }
            } else {
                decrease = 0;
            }
        }
        System.out.println("Max sequence increase digits: ");
        int[] maxArr = new int[max + 1];
        System.arraycopy(oneLineMatrix, (amountToHigh - max), maxArr, 0, (max + 1));
        System.out.println(Arrays.toString(maxArr) + " " + (max + 1));
        System.out.println("Max sequence decrease digits:");
        int[] minArr = new int[min + 1];
        System.arraycopy(oneLineMatrix, (amountToLow - min), minArr, 0, (min + 1));
        System.out.println(Arrays.toString(minArr) + " " + (min + 1));
    }

}

