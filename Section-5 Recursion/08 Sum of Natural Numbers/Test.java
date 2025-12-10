public class Test {
    static int sumByIteration(int n)     // TC: O(n), SC: O(1)
    {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum+=i;
        }

        return sum;
    }

    static int sumByFormula(int n)  // TC: O(1), SC: O(1)
    {
        return n*(n-1)/2;
    }

    static int sumByRecursion(int n)     // TC: O(n), SC: O(n)
    {
        if(n>0)
        {
            return n+sumByRecursion(n-1);
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumByRecursion(10));
    }
}
