public class Test {
    // static int x=0;
    int x=0;

    int fun(int n)
    {
        if(n>0)
        {
            x++;
            // return fun(n-1)+n;      // Checking with the 'n'.
            return fun(n-1)+x;      // Checking with the static variable 'x'.
        }
        return 0;
    }

    public static void main(String[] args) {
        int a=5;

        Test t= new Test();
        System.out.println(t.fun(a));
    }
}
