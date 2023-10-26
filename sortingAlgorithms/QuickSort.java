
import java.util.Arrays;

public class QuickSort {

    void quickSort(int[] arr, int lmi, int rmi) {
        if (lmi < rmi) {
            int pointer = partition(arr, lmi, rmi);
            quickSort(arr, lmi, pointer - 1);
            quickSort(arr, pointer + 1, rmi);
        }
    }

    int partition(int[] arr, int lmi, int rmi) {
        int pivot = arr[rmi];
        int pointer = lmi - 1;
        for (int i = lmi; i < rmi; i++) {
            if (arr[i] <= pivot) {
                pointer++;
                int temp = arr[pointer];
                arr[pointer] = arr[i];
                arr[i] = temp;
            }
        }
        pointer++;
        int temp = arr[pointer];
        arr[pointer] = arr[rmi];
        arr[rmi] = temp;
        return pointer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 9, 1, 3};
        new QuickSort().partition(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

    }
}
