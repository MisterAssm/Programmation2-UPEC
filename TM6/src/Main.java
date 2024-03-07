import java.util.Arrays;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        testSort(new int[]{1, 5, 7, 1, 6, 8, 4}, Main::bubbleSort);
        testSort(new int[]{1, 5, 7, 1, 6, 8, 4}, Main::selectionSort);
        testSort(new int[]{1, 5, 7, 1, 6, 8, 4}, Main::insertionSort);

    }

    private static boolean bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j+1);
                }
            }

        }

        return true;
    }


    private static boolean selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minimumIndex] > array[j]) {
                    minimumIndex = j;
                }
            }
            swap(array, i, minimumIndex);
        }

        return true;
    }

    private static boolean insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {

            int j = i;

            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j, j - 1);
                --j;
            }
        }

        return true;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    private static void testSort(int[] input, Function<int[], Boolean> function) {
        System.out.print(Arrays.toString(input) + " -> ");
        function.apply(input);
        System.out.println(Arrays.toString(input));
    }
}