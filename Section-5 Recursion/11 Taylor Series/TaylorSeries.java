public class TaylorSeries {
    public static double p = 1;   // product
    public static double f = 1;   // factorial
    public static double temp = 1;    // temp result

    public static double e(int x, int n) {
        double r;
        if(n==0) return 1;
        else
        {
            r = e(x, n-1);

            p *= x;
            f *= n;

            return r + (double)(p/f);
        }
    }

    // Optimized Taylor Series (With Less Number of Multiplication) ---------------

    // a. Using the iterative approach
    public static double taylorSeriesUsingIterativeApproach(int x, int n) {
        double temp = 1;

        for (int i = n; i>0; i--)
        {
            temp = 1 + (x/(double)i)*temp;
        }
        
        return temp;
    }

    // b. Using the recursive approach
     private static double taylorSeriesUsingRecursiveApproach(int x, int n) {

        if(n==0) return temp;

        temp = 1 + (x/(double)n)*temp;

        return  taylorSeriesUsingRecursiveApproach(x, n-1);
    }

    public static void main(String[] args) {
        System.out.println(e(4,4));

        System.out.println(taylorSeriesUsingIterativeApproach(4,4));

        System.out.println(taylorSeriesUsingRecursiveApproach(4,4));

        // Don't call the recursive approach again, as it will give wrong result because of static variable temp
    }
}
