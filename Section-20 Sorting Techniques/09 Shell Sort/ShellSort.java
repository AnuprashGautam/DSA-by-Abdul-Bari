public class ShellSort {
    static void shellSort(int[] A, int n)
    {
        int gap,i,j,temp;

        for(gap=n/2; gap>=1; gap/=2)
        {
            for(i=gap; i<n; i++)
            {
                // Insertion sort concept
                temp=A[i];
                j=i-gap;
            
                while(j>=0 && A[j]>temp)
                {
                    A[j+gap]=A[j];
                    j=j-gap;
                }
                A[j+gap]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] A={9,5,16,8,13,6,12,10,4,2,3};

        shellSort(A, A.length);

        for(int n: A)
        {
            System.out.print(n+" ");
        }
    }
}
