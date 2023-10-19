
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SelectionSort {

    public void SSort(List<Integer> arr) {
        int size = arr.size();

        for (int i = 0; i < size - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < size; j++) {
                if (arr.get(smallest) > arr.get(j)) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(smallest));
                arr.set(smallest, temp);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 4, 10, 1, 0, 1000, 243, 18));
        var mySS = new SelectionSort();
        mySS.SSort(arr);
        System.out.println("Array after Selection Sort is " + arr);
    }
}
