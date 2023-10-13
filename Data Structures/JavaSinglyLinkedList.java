
public class JavaSinglyLinkedList {

    Node head;

    static class Node {

        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public void insertAtBeginning(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAtEnd(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
    }

    public void insertAtMiddle(Node prev_node, int data) {
        Node new_node = new Node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void delete(int position) {
        if (head == null) {
            return;
        }

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return;
        }

        Node next = temp.next.next;
        temp.next = next;

    }

    public void printLL() {
        Node node = head;
        while (node != null) {
            System.out.println(node.value + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        JavaSinglyLinkedList myLL = new JavaSinglyLinkedList();

        myLL.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        myLL.head.next = second;
        second.next = third;

        myLL.insertAtBeginning(10);
        myLL.insertAtEnd(20);
        myLL.insertAtMiddle(second, 45);
        myLL.delete(3);

        myLL.printLL();
    }

}
