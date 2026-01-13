import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int val;
    Node left;
    Node right;
    
    Node(int val)
    {
        this.val=val;
    }
}

public class BinaryTreeExample
{
    Node createBinaryTree()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("What is the root node? ");
        int rootVal=sc.nextInt();

        Node root=new Node(rootVal);

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty())
        {
            Node popedNode = q.poll();

            System.out.println("What is left child for this node "+popedNode.val+" ?(-1 for none)");
            int leftVal = sc.nextInt();

            if(leftVal!=-1)
            {
                Node leftChild = new Node(leftVal);
                popedNode.left=leftChild;
                q.add(leftChild);
            }

            System.out.println("What is right child for this node "+popedNode.val+" ?(-1 for none)");
            int rightVal = sc.nextInt();

            if(rightVal!=-1)
            {
                Node rightChild = new Node(rightVal);
                popedNode.right=rightChild;
                q.add(rightChild);
            }
        }

        System.err.println("Congratulations! Your binary tree is ready.");

        return root;
    }

    void inOrderTraversal(Node node)
    {
        if(node!=null)
        {
            inOrderTraversal(node.left);
            System.out.print(node.val+" ");
            inOrderTraversal(node.right);
        }
    }
    public static void main (String[] args)
    {
        BinaryTreeExample b = new BinaryTreeExample();

        Node root = b.createBinaryTree();

        System.out.println("--------------------INORDER TRAVERSAL:---------------------");
        b.inOrderTraversal(root);
    }
}