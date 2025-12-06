public class Test
{
    static void funRecursion(int n)
    {
        if(n>0)
        {
            funRecursion(n-1);
            System.out.println(n);
        }
    }

    static void funIterationIncorrect(int n)
    {
        while(n>0)
        {
            n--;
            System.out.println(n);
        }
    }

    static void funIterationCorrect(int n)
    {
        int i=1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }

    public static void main (String[] args)
    {
        int x=3;

        funRecursion(x);
        System.out.println("----");
        funIterationIncorrect(x);
        System.out.println("----");
        funIterationCorrect(x);
    }
}