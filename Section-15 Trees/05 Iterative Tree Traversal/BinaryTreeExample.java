import java.util.ArrayDeque;
import java.util.Deque;
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

    void preOrderIterativeTraversal(Node node)
    {
        Deque<Node> stack = new ArrayDeque<Node>();

        while(node!=null || !stack.isEmpty())
        {
            if(node!=null)
            {
                System.out.print(node.val+" ");
                stack.push(node);
                node= node.left;
            }
            else if(node==null)
            {
                Node popedNode= stack.pop();
                node = popedNode.right;
            }
        }
    }

    void inOrderIterativeTraversal(Node node)
    {
        Deque<Node> stack = new ArrayDeque<Node>();

        while(node!=null || !stack.isEmpty())
        {
            if(node!=null)
            {
                stack.push(node);
                node= node.left;
            }

            else if(node==null)
            {
                Node popedNode= stack.pop();
                System.out.print(popedNode.val+" ");
                node = popedNode.right;
            }
        }
    }

    void postOrderIterativeTraversal(Node node)
    {
        Deque<Node> stack = new ArrayDeque<Node>();

        while(node!=null || !stack.isEmpty())
        {
            if(node!=null)
            {
                stack.push(node);
                node= node.left;
            }

            else if(node==null)
            {
                Node popedNode= stack.pop();

                if(popedNode.val<0)
                {
                   System.out.print(popedNode.val*-1);
                   node=null;
                }
                else{
                    stack.push(new Node(-popedNode.val));
                    node= popedNode.right;
                }
            }
        }
    }

    public static void main (String[] args)
    {
        Node root =new BinaryTreeExample().createBinaryTree();


        System.out.println("-----------------ITERATIVE TREE TRAVERSAL------------");

        // new BinaryTreeExample().preOrderIterativeTraversal(root);
        // new BinaryTreeExample().inOrderIterativeTraversal(root);
        new BinaryTreeExample().postOrderIterativeTraversal(root);
        
    }
}