
public class JavaStack {

    private int[] arr;
    private int top;
    private int capacity;

    JavaStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated\n");
            System.exit(1);
        }

        return arr[top--];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        JavaStack myStack = new JavaStack(5);

        myStack.push(10);
        myStack.push(5);
        myStack.push(9);

        System.out.println("Removing " + myStack.pop());
        myStack.printStack();
        System.out.println("Stack size is " + myStack.size());
    }

}
