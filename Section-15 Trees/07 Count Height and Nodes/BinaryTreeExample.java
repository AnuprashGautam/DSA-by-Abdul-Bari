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

    int countHeight(Node node, int h)
    {
        if(node==null) return 0;

        if(node.left==null && node.right==null)
        {
            return h;
        }

        return Math.max(countHeight(node.left, h+1), countHeight(node.right, h+1));
    }

    int countNodes(Node node)
    {
        if(node!=null)
        {
            return countNodes(node.left)+countNodes(node.right)+1;
        }
        return 0;
    }
    public static void main (String[] args)
    {
        BinaryTreeExample b = new BinaryTreeExample();

        Node root = b.createBinaryTree();

        System.out.println("Height: "+b.countHeight(root,0));
        System.out.println("Nodes: "+b.countNodes(root));
    }
}