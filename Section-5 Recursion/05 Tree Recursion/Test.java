public class Test {
    static void fun(int n)
    {
        if(n>0)
        {
            System.out.print(n+" ");

            fun(n-1);
            fun(n-1);
        }
    }

    public static void main(String[] args) {
        int x=3;

        fun(x);
    }
}
