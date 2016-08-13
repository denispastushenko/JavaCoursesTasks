import java.util.Random;
import  static utils.LineSeparator.*;
public class Task3 {
    private static Random Random = new Random();
    private static int[] Arr = new int[10];

    public static void main(String[] args) {
        horizontallyArray();
        uprightArray();
    }

    private static void horizontallyArray() {
        System.out.println("Horizontally array: ");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = Random.nextInt(10);
            System.out.print(Arr[i] + " ");
        }
    }

    private static void uprightArray() {
        System.out.println(lineSeparator() + "Upright array: ");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = Random.nextInt(10);
            System.out.println(Arr[i]);
        }
    }


}
