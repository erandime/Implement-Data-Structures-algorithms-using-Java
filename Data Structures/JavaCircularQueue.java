
public class JavaCircularQueue {

    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int count;

    public JavaCircularQueue(int size) {
        arr = new int[size];
        front = 0;
        rear = size - 1;
        this.size = size;
        count = 0;
    }

    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is Full");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        rear = (rear + 1) % size;
        arr[rear] = x;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }

        count--;
        return arr[front++ % size];
    }

    public boolean isFull() {
        return count == size;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        JavaCircularQueue myQueue = new JavaCircularQueue(5);

        myQueue.enqueue(10);
        myQueue.enqueue(5);
        myQueue.enqueue(9);
        System.out.println("Removing " + myQueue.dequeue());
        myQueue.printQueue();
        System.out.println("Number of items is " + myQueue.count);

    }

}
