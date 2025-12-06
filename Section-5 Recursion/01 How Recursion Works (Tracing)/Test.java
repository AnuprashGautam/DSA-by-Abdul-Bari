public class Test
{
    static  void fun1(int n)    // Calling Phase
    {
        if(n>0)
        {
            System.out.println(n);
            fun1(n-1);
        }
    }

    static  void fun2(int n)    // Returning Phase
    {
        if(n>0)
        {
            fun2(n-1);
            System.out.println(n);
        }
    }

    public static void main (String[] args)
    {
        int x=3;
        // fun1(x);
        fun2(x);
    }
}