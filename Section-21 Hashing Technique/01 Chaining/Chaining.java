
class Node{
    int val;
    Node next;

    Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}

public class Chaining {
    Node[] HT= new Node[10];

    // Inserting the value in sorted chains
    public void insert(int val)
    {
        int index=Math.abs(val)%10;
        Node bucket=HT[index];
        Node newNode= new Node(val);

        if(bucket==null)
        {
            HT[index]=newNode;
        }else{
            Node p,q;
            q=null;
            p=bucket;

            while(p!=null && p.val<val)
            {
                q=p;
                p=p.next;
            }

            // Case 1: When first element of the chain is larger.
            if(q==null)
            {
                newNode.next=p;
                HT[index]=newNode;
            }
            // Case 2: Inserting somewhere in the middle of the chain
            else{
                newNode.next=p;
                q.next=newNode;
            }
        }
    }

    // Searching if the node is present or not
    public int search(int key)
    {
        int index=Math.abs(key)%10;
        Node p = HT[index];

        while(p!=null)
        {
            if(p.val==key)
            {
                return p.val;
            }
            p=p.next;
        }

        return -1;
    }

    // Deleting the element
    public boolean delete(int key)
    {
        int index=Math.abs(key)%10;
        Node p = HT[index];
        Node q=null;

        while(p!=null)
        {
            if(p.val==key)
            {
                q.next=p.next;
                return true;
            }
            q=p;
            p=p.next;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] A = {16, 12, 25, 39, 6, 122, 5, 68, 75};
        Chaining c=new Chaining();

        for(int n: A)
        {
            c.insert(n);
        }

        System.out.println("All element inserted.");

        System.out.println("Checking if val 12 is present or not.");
        int result=c.search(12);
        if(result!=-1)
        {
            System.out.println("Found the value: "+result);
        }else{
            System.out.println("Sorry! 12 was not there.");
        }

        System.out.println("Checking if val 100 is present or not.");
        int result1=c.search(100);
        if(result1!=-1)
        {
            System.out.println("Found the value: "+result1);
        }else{
            System.out.println("Sorry! 100 was not there.");
        }

        System.out.println("Deleting the node 16: "+c.delete(16));
        System.out.println("Checking if 16 is present or not: "+c.search(16));
    }
}
