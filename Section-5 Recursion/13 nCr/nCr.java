public class nCr {

    // Approach - 1: Using Factorial -------------------
    public static int nCrRecursive(int n, int r){
        if(r==0 || r==n) return 1;
        int t1, t2, t3;
        t1 = factorial(n);
        t2 = factorial(r);
        t3 = factorial(n-r);
        return t1/(t2*t3);
    }

    // Helper method to calculate factorial
    private static int factorial(int n){
        if(n==0 || n==1) return 1;
        else return n*factorial(n-1);
    }

    // Approach - 2: Using Recursion -------------------
    public static int nCrRecursiveOptimized(int n, int r){
        if(r==0 || r==n) return 1;
        return nCrRecursiveOptimized(n-1, r-1) + nCrRecursiveOptimized(n-1, r);
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        System.out.println(nCrRecursive(n, r));
        System.out.println(nCrRecursiveOptimized(n, r));
    }
}
