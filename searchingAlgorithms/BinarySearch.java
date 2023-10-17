
import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {

    int index = -1;

    public int BSearch(ArrayList<Integer> arrl, int num) {
        int high = arrl.size() - 1;
        int low = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (num == arrl.get(mid)) {
                return this.index = mid;
            } else if (num > arrl.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        var arrl = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6, 7, 9, 10, 11));
        int num = 9;
        var myBS = new BinarySearch();
        myBS.BSearch(arrl, num);

        if (myBS.index == -1) {
            System.out.println("Value is Not Found");
        } else {
            System.out.println("Value is Found at " + (myBS.index + 1));
        }
    }
}
