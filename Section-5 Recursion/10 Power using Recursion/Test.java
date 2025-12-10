public class Test {
    static int pow(int m, int n)            // More Multiplication Operations
    {
        if(n==0)
        {
            return 1;
        }
        return pow(m, n-1)*m;
    }

    static int powOptimized(int m, int n)   // Less Multiplication Operations
    {
        if(n==0)
        {
            return 1;
        }
        else if( n%2==0)
        {
            return powOptimized(m*m, n/2);
        }
        else{
            return m* powOptimized(m*m, (n-1)/2);
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2,5));
        System.out.println(powOptimized(2,5));
    }
}
