
import java.util.ArrayList;
import java.util.List;


public class BucketSort {

    static int findMax(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int n : A) {
            max = Math.max(max, n);
        }
        return max;
    }

    static void bucketSort(int[] A) {
        int max = findMax(A);

        // Creating bins of size max+1
        List<List<Integer>> bins = new ArrayList<>();

        for(int i=0; i<max+1; i++)
        {
            bins.add(new ArrayList<>());
        }

        // Adding the elements to the bins
        for(int n: A)
        {
            bins.get(n).add(n);
        }

        // Collecting elements back from the bins
        int index=0;
        for(int i=0; i<max+1; i++)
        {
            for(int n: bins.get(i))
            {
                A[index++]=n;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {8, 2, 9, 6, 5, 3, 7, 4};

        bucketSort(A);

        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
