
import java.util.Arrays;
import java.util.ArrayList;

public class InsertionSort {

    public void iSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;            
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 1, 9, 45, 21};
        var sort = new InsertionSort();
        
        sort.iSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
