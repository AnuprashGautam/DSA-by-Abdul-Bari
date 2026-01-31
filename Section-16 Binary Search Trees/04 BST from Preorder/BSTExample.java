import java.util.ArrayDeque;
import java.util.Deque;

class Node {
    Node left, right;
    int val;

    public Node(int val) {
        this.val = val;
    }
}

public class BSTExample {
    static Deque<Node> stack = new ArrayDeque<>();

    static void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }

    static Node bstFromPreOrder(Node node, int key) {
        Node newNode = new Node(key);
        if (key < node.val) {
            node.left = newNode;
            stack.push(node);
            node = newNode;
        } else {
            if (key < (stack.isEmpty() ? Integer.MAX_VALUE : stack.peek().val)) {
                node.right = newNode;
                node = newNode;
            } else {
                node = stack.pop();
                bstFromPreOrder(node, key);
                node = newNode;
            }
        }
        return node;
    }

    public static void main(String[] args) {
        int[] preOrder = { 30, 20, 10, 15, 25, 40, 50, 45 };
        Node root = new Node(preOrder[0]);
        Node node = root;
        for (int i = 1; i < preOrder.length; i++) {
            node = bstFromPreOrder(node, preOrder[i]);
        }
        System.out.println("-----INORDER TRAVERSAL OF THE BST TREE FORMED-------");
        inOrderTraversal(root);
    }
}