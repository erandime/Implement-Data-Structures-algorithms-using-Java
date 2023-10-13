
import java.util.ArrayList;

public class JavaMaxHeap {

    void heapify(ArrayList<Integer> arrl, int i) {
        int size = arrl.size();
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arrl.get(left) > arrl.get(largest)) {
            largest = left;
        }
        if (right < size && arrl.get(right) > arrl.get(largest)) {
            right = largest;
        }

        if (largest != i) {
            int temp = arrl.get(largest);
            arrl.set(largest, arrl.get(i));
            arrl.set(i, temp);

            heapify(arrl, largest);
        }
    }

    void insert(ArrayList<Integer> arrl, int num) {
        int size = arrl.size();
        if (size == 0) {
            arrl.add(num);
        } else {
            arrl.add(num);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(arrl, i);
            }
        }
    }

    void delete(ArrayList<Integer> arrl, int num) {
        int size = arrl.size();
        int i;
        for (i = 0; i < size; i++) {
            if (num == arrl.get(i)) {
                break;
            }
        }

        int temp = arrl.get(i);
        arrl.set(i, arrl.get(size - 1));
        arrl.set(size - 1, temp);

        arrl.remove(size - 1);
        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(arrl, j);
        }
    }

    void printHeap(ArrayList<Integer> arrl, int size) {
        for (Integer i : arrl) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<Integer> myArrayl = new ArrayList<>();
        int size = myArrayl.size();
        JavaMaxHeap mh = new JavaMaxHeap();

        mh.insert(myArrayl, 3);
        mh.insert(myArrayl, 4);
        mh.insert(myArrayl, 9);
        mh.insert(myArrayl, 5);
        mh.insert(myArrayl, 2);

        System.out.println("Max heap array ");
        mh.printHeap(myArrayl, size);
    }

}
