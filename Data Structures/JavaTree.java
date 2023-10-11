
class JavaTree {

    Node root;

    JavaTree() {
        root = null;
    }

    void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + "->");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + "->");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + "->");
    }

    public static void main(String[] args) {
        JavaTree tree = new JavaTree();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(3);

        System.out.println("Inorder traversal\n");//5,12,6,1,7,9,3
        tree.inorder(tree.root);

        System.out.println("\n\nPreorder traversal\n ");//1,12,5,6,9,7,3
        tree.preorder(tree.root);

        System.out.println("\n\nPostorder traversal\n ");//5,6,12,7,3,9,1
        tree.postorder(tree.root);
    }

}

class Node {

    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
