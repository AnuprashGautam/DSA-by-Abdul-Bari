import java.util.Arrays;

public class QuadraticProbing
{
    final int SIZE=10;
    int[] HT=new int[SIZE];

    public QuadraticProbing() {
        Arrays.fill(HT, -1);
    }

    int hash(int key)
    {
        return key%SIZE;
    }

    int probe(int key)
    {
        int i=0;
        int index=hash(key);

        while(i<SIZE && HT[(index+i*i)%SIZE]!=-1)
        {
            i++;
        }

        if(i==SIZE) return -1;  // HT is full
        return (index+i*i)%SIZE;
    }

    void insert(int key)
    {
        int index=hash(key);
        if(HT[index]==-1)
        {
            HT[index]=key;
        }
        else{
            index=probe(key);
            if(index!=-1)
            {
                HT[index]=key;
            }else{
                System.out.println("Hash table is full.");
            }
        }
    }

    int search(int key)
    {
        int index=hash(key);
        int i=0;

        while(i<SIZE && HT[(index+i*i)%SIZE]!=key)
        {
            i++;
        }


        if(HT[(index+i*i)%SIZE]==key) return (index+i*i)%SIZE;
        return -1;
    }

    
    public static void main (String[] args)
    {
        int[] A={23,43,13,27};
        QuadraticProbing l=new QuadraticProbing();

        for(int n: A)
        {
            l.insert(n);
        }

        System.out.println("All element inserted.");
        System.out.println("========================");
        System.out.println("Searching for key 43: "+l.search(43));
        System.out.println("Searching for key 1000: "+l.search(1000));
        System.out.println("Searching for key 27: "+l.search(27));

    }
}