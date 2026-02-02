public class CountSort {
    static int findMax(int[] A)
    {
        int maxElement=Integer.MIN_VALUE;

        for(int n: A)
        {
            maxElement=Math.max(maxElement, n);
        }

        return maxElement;
    }

    static void countSort(int[] A, int n)
    {
        int i;
        int maxElement=findMax(A);
        int[] C=new int[maxElement+1];

        // Updating the count array i.e. C according to the elements in the main array i.e. A.
        for(i=0; i<n; i++)
        {
            C[A[i]]++;
        }

        // Now updating the original array with the help of counting array
        i=0;        // For main array i.e. A
        int j=0;    // For counting array i.e. C

        while(j < maxElement+1)
        {
            if(C[j]>0)
            {
                A[i++]=j;
                C[j]--;
            }else{
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] A={8,2,9,6,5,3,7,4};
        
        countSort(A, A.length);

        for(int num: A)
        {
            System.out.print(num+" ");
        }
    }
}
