import java.util.ArrayList;

public class LuckyNumbers {
    private static Integer step = 3;
    private static int element = 3;
    private static ArrayList<Integer> NUMBERS = new ArrayList<>();

    public static void main(String[] args) {
        fillArr();
        mainCounter();
        counter();
    }

    private static void fillArr() {
        Integer MAX = 1000;
        for (int i = 1; i <= MAX; i += 2) {
            NUMBERS.add(i);
        }
    }

    private static void counter() {
        for (Integer number : NUMBERS) {
            int result = number;
            System.out.print(result + " ");
        }
    }

    private static void mainCounter() {
        Integer size = NUMBERS.size();
        int theFirstVariable;
        int theSecondVariable = 0;
        int theThirdVariable;
        while (step < size) {
            theFirstVariable = NUMBERS.size();
            theThirdVariable = 1;

            for (int i = step; i < theFirstVariable; i += step) {
                NUMBERS.remove(i - theThirdVariable);
                theThirdVariable = theThirdVariable + 1;
            }

            theFirstVariable = NUMBERS.size() - 1;
            theSecondVariable = NUMBERS.get(theFirstVariable);
            size = size - NUMBERS.size() / step;
            step = NUMBERS.get(element - 1);
            element = element + 1;
        }
    }
}