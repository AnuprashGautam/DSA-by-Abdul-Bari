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

    int countLeafNodes(Node node)
    {
        if(node==null) return 0;

        if(node.left==null && node.right==null)
        {
            return 1;
        }

        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    int countDeg2Nodes(Node node)
    {
        if(node==null) return 0;

        if(node.left!=null && node.right!=null)
        {
            return countDeg2Nodes(node.left) + countDeg2Nodes(node.right) + 1;
        }

        return 0;
    }

    int countDeg1Nodes(Node node)
    {
        if(node==null) return 0;

        // L ^ R = L'R + LR'

        if(node.left==null ^ node.right==null)
        {
            return countDeg1Nodes(node.left==null? node.right: node.left) + 1;
        }

        return countDeg1Nodes(node.left) + countDeg1Nodes(node.right);
    }

    public static void main (String[] args)
    {
        BinaryTreeExample b = new BinaryTreeExample();

        Node root = b.createBinaryTree();

        System.out.println("Leaf Nodes: "+b.countLeafNodes(root));
        System.out.println("Deg 2 Nodes: "+b.countDeg2Nodes(root));
        System.out.println("Deg 1 Nodes: "+b.countDeg1Nodes(root));
    }
}