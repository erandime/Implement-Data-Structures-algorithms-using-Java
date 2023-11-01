
import java.util.Arrays;

public class QuickSort {
//rmi = size - 1, lmi = 0

    static void quicksort1(int[] array, int lmi, int rmi) {
        if (lmi < rmi) {
            int p = quicksort2(array, lmi, rmi);
            quicksort1(array, p + 1, rmi);
            quicksort1(array, lmi, p - 1);
        }
    }

    static int quicksort2(int[] array, int lmi, int rmi) {
        int pointer = lmi;
        int pivot = rmi;

        for (int i = lmi; i < rmi; i++) {
            if (array[i] <= array[pivot]) {
                int temp = array[pointer];
                array[pointer] = array[i];
                array[i] = temp;
                pointer++;
            }
        }

        int temp = array[pointer];
        array[pointer] = array[pivot];
        array[pivot] = temp;

        return pointer;
    }

    public static void main(String[] args) {

        int[] arr = {8, 7, 6, 1, 0, 9, 2};
        QuickSort.quicksort1(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
