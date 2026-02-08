

public class LinearProbing
{
    static final int SIZE=10;
    int[] HT=new int[SIZE];

    int hash(int key)
    {
        return key%SIZE;
    }

    int probe(int key)
    {
        int index=hash(key);
        int i=0;

        while(HT[(index+i)%SIZE]!=0)
        {
            i++;
        }

        return (index+i)%SIZE;
    }

    void insert(int key)
    {
        int index=hash(key);
        if(HT[index]==0)
        {
            HT[index]=key;
        }else{
            index=probe(key);
            HT[index]=key;
        }
    }

    int search(int key)
    {
        int index=hash(key);
        int i=0;

        while(HT[(index+i)%SIZE]!=0)
        {
            if(HT[(index+i)%SIZE]==key)
            {
                return (index+i)%SIZE;
            }
            i++;
        }

        return -1;
    }
    public static void main (String[] args)
    {
        int[] A={26,30,45,23,25,43,74,29,19};
        LinearProbing l=new LinearProbing();

        for(int n: A)
        {
            l.insert(n);
        }

        System.out.println("All element inserted.");
        System.out.println("========================");
        System.out.println("Searching for key 74: "+l.search(74));
        System.out.println("Searching for key 1000: "+l.search(1000));
        System.out.println("Searching for key 19: "+l.search(19));

    }
}