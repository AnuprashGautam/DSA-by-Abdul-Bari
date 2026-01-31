
class Node{
    int val;
    Node left, right;

    Node(int val)
    {
        this.val=val;
    }
}


public class BSTExample {
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

    static Node searchNode(Node node, int key)
    {
        if(node!=null)
        {
            if(node.val==key)
            {
                return node;
            }
            else if(node.val > key)
            {
                return searchNode(node.left, key);
            }
            else if(node.val < key)
            {
                return searchNode(node.right, key);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nodes = {50, 60, 30, 10, 2};

        Node root = insertNode(null, nodes[0]);

        for(int i=1; i<nodes.length; i++)
        {
           insertNode(root, nodes[i]);
        }

        System.out.println("BST CREATED SUCCESSFULLY!!!");

        System.out.println("Check if there is 2 node: "+searchNode(root, 2));
        System.out.println("Check if there is 100 node: "+searchNode(root, 100));
    }
}
