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

    static void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }

    static Node bstFromPostOrder(int[] preOrder) {

        Node root = new Node(preOrder[preOrder.length-1]);
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        for (int i = preOrder.length-2; i >=0; i--) {
            Node newNode = new Node(preOrder[i]);

            // case 1: left child
            if (preOrder[i] < stack.peek().val) {
                stack.peek().left = newNode;
            }
            // case 2: right child
            else {
                Node parent = null;

                while (!stack.isEmpty() && preOrder[i] > stack.peek().val) {
                    parent = stack.pop();
                }

                parent.right = newNode;
            }

            stack.push(newNode);
        }

        return root;
    }

    public static void main(String[] args) {

        int[] postOrder = {15, 10, 25, 20, 45, 50,40,30};

        Node root = bstFromPostOrder(postOrder);

        System.out.println("-----INORDER TRAVERSAL OF THE BST TREE FORMED-------");
        inOrderTraversal(root);
    }
}
