
import java.util.Arrays;

public class MergeSort {

    void mergeSort1(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort1(arr, p, q);
            mergeSort1(arr, q + 1, r);
            mergeSort2(arr, p, q, r);
        }
    }

    void mergeSort2(int[] arr, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] s1 = new int[n1];
        int[] s2 = new int[n2];

        int i, j, k = p;

        for (i = 0; i < n1; i++) {
            s1[i] = arr[p + i];
        }
        for (j = 0; j < n2; j++) {
            s2[j] = arr[q + 1 + j];
        }

        i = 0;
        j = 0;

        while (i < n1 && j < n2) {
            if (s1[i] < s2[j]) {
                arr[k] = s1[i];
                i++;
            } else {
                arr[k] = s2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = s1[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = s2[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 34, 100, 45, 21, 3};
        var ms = new MergeSort();

        ms.mergeSort1(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }
}
