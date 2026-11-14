public class FibonacciSeries {

    // Iterative Approach
    public static int fibIterative(int n){
        int t1=0, t2=1, s=0;

        if(n<=1) return n;

        for(int i = 2; i<=n; i++)
        {
            s=t1+t2;
            t1=t2;
            t2=s;
        }

        return s;
    }

    // Massive Recursion (Exponential Time Complexity) -----------------------------
    public static int fibRecursive(int n) {
        if(n <= 1) return n;
        else return fibRecursive(n-2) + fibRecursive(n-1);
    }

    // Memorization Recursion (Linear Time Complexity) ----------------------------
    public static int fibMemorization(int n, int[] memory){
        if(n<=1){
            memory[n] = n;
            return n;
        }else{
            if(memory[n-2]==-1)
            {
                memory[n-2] = fibMemorization(n-2, memory);
            }
            if(memory[n-1]==-1)
            {
                memory[n-1] = fibMemorization(n-1, memory);
            }
            return memory[n-2]+memory[n-1];
        }
    }

    public static void main(String[] args) {
        int n = 7;

        int[] memory = new int[n];

        for(int i = 0; i<n; i++)
        {
            memory[i]=-1;
        }

        System.out.println(fibIterative(n));

        System.out.println(fibRecursive(n));

        System.out.println(fibMemorization(n, memory));
    }

}
