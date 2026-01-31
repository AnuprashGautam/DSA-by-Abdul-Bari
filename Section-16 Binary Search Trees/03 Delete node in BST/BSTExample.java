class Node{
    int val;
    Node left, right;

    Node(int val)
    {
        this.val=val;
    }
}


public class BSTExample {
    static Node inorderPredecessor(Node node)
    {
        while(node!=null && node.right!=null)
        {
            node=node.right;
        }
        return node;
    }

    static Node inorderSuccessor(Node node)
    {
        while(node!=null && node.left!=null)
        {
            node=node.left;
        }
        return node;
    }

    static int height(Node node)
    {
        if(node==null)
        {
            return 0;
        }

        int x = height(node.left);
        int y = height(node.right);

        return (x>y)? x+1: y+1;
    }
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

    static Node deleteNode(Node node, int key)
    {
        if(node==null)
        {
            return null;
        }

        // Navigate to left
        if(key<node.val)
        {
            node.left=deleteNode(node.left, key);
        }

        // Navigate to right
        if(key>node.val)
        {
            node.right=deleteNode(node.right, key);
        }

        // Found
        if(node.val==key)
        {
            if(node.left==null && node.right==null)
            {
                return null;
            }// Core of Problem
            else if(node.left!=null && node.left!=null)
            {
                if(height(node.left)>height(node.right))
                {
                    Node pre=inorderPredecessor(node.left);
                    node.val=pre.val;
                    node.left=deleteNode(node.left, pre.val);

                }else{
                    Node succ=inorderSuccessor(node.right);
                    node.val=succ.val;
                    node.right=deleteNode(node.right, succ.val);
                }
            }
            else if(node.left!=null)
            {
                node=node.left;
            }
            else if(node.right!=null)
            {
                node=node.right;
            }
        }

        return node;
    }

    
    public static void main(String[] args) {
        int[] nodes = {50, 20, 25, 5, 23, 60, 55, 56, 65};

        Node root = insertNode(null, nodes[0]);

        for(int i=1; i<nodes.length; i++)
        {
            insertNode(root, nodes[i]);
        }

        System.out.println("BST CREATED SUCCESSFULLY!!!");

        inOrderTraversal(root);System.out.println();

        System.out.println("Deleting node 30.");

        Node node = deleteNode(root, 55);

        if(node!=null)
        {
            System.out.println("Node deleted successfully!!!");
            inOrderTraversal(root);System.out.println();
        }else{
            System.out.println("Node didn't deleted.");
        }
    }
}
