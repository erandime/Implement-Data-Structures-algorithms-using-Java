package algorithmsJava.searchingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {

    int index = -1;
    int num;

    public LinearSearch(ArrayList<Integer> arrl, int num) {
        int size = arrl.size();
        this.num = num;
        for (int i = 0; i < size; i++) {
            if (arrl.get(i) == num) {
                this.index = i;
            }
        }
    }

    public LinearSearch(int[] arr, int num) {
        int size = arr.length;
        this.num = num;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                this.index = i;
            }
        }
    }

    public String toString() {
        if (index != -1) {
            return num + " is found at position " + (index + 1);
        }
        return num + " is not Found";
    }

    public static void main(String args[]) {
        LinearSearch mySearch1 = new LinearSearch(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)), 10);
        var mySearch2 = new LinearSearch(new ArrayList<Integer>(Arrays.asList(1, 0, 7, 9, 10)), 7);
        var mySearch3 = new LinearSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 8);
        var mySearch4 = new LinearSearch(new int[]{2, 4, 6, 8}, 10);
        System.out.println("Search1: " + mySearch1);
        System.out.println("Search2: " + mySearch2);
        System.out.println("Search3: " + mySearch3);
        System.out.println("Search4: " + mySearch4);
    }

}
