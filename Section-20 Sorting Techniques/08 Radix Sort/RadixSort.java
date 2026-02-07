import java.util.ArrayList;
import java.util.List;

public class RadixSort {

    static int findMax(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int n : A) {
            max = Math.max(max, n);
        }
        return max;
    }

    static void radixSort(int[] A) {

        int radix=10;
        int max=findMax(A);

        //Create bins
        List<ArrayList<Integer>> bins=new ArrayList<>();

        //Add the bins
        for(int i=0; i<radix;i++)
        {
            bins.add(new ArrayList<>());
        }

        for(int divisor=1; max/divisor>0; divisor*=10)
        {
            // Distribute the elements in bins
            for(int n: A)
            {
                int bin=(n/divisor)%10;
                bins.get(bin).add(n);
            }

            // Collect the elements from bin
            int index=0;
            for(int j=0; j<10; j++)
            {
                for (int n : bins.get(j)) {
                    A[index++] = n;
                }
                bins.get(j).clear(); // IMPORTANT
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {890, 12, 190, 68, 5, 13, 70, 4};

        radixSort(A);

        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
