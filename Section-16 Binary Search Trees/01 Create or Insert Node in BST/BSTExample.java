
class Node{
    int val;
    Node left, right;

    Node(int val)
    {
        this.val=val;
    }
}


public class BSTExample {
    static void inOrderTraversal(Node node)
    {
        if(node!=null)
        {
            inOrderTraversal(node.left);
            System.out.print(node.val+" ");
            inOrderTraversal(node.right);
        }
    }

    static Node insertNode(Node root, int val)
    {
        if(root==null)
        {
            return new Node(val);
        }

        if(root.val > val)
        {
            root.left=insertNode(root.left, val);
        }else if(root.val < val)
        {
            root.right=insertNode(root.right, val);
        }

        return root;
    }

    public static void main(String[] args) {
        int[] nodes = {50, 60, 30, 10, 2};

        Node root = insertNode(null, nodes[0]);

        for(int i=1; i<nodes.length; i++)
        {
           insertNode(root, nodes[i]);
        }

        System.out.println("BST created successfully!!!");

        inOrderTraversal(root);
    }
}
