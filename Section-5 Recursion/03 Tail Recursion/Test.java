public class Test
{
    static void funRecursion(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            funRecursion(n-1);
        }
    }

    static void funIteration(int n)
    {
        while(n>0)
        {
            System.out.println(n);
            n--;
        }
    }

    public static void main (String[] args)
    {
        int x=3;

        funRecursion(x);
        funIteration(x);
    }
}