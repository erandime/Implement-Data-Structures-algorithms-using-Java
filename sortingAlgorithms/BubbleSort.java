package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        var myBubbleSort = new BubbleSort();

        int[] arr = {1, 5, 8, 2, 9, 10, 100, 543};

        int size = arr.length;
        for (int i = size; i > 1; i--) {
            for (int j = 0; j < size - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
