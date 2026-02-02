public class MergeSort {
    static void merge(int[] A, int l, int mid, int h)
    {
        int i=l;
        int j=mid+1;
        int k=l;
        int[] C= new int[h+1];

        while(i<=mid && j<=h)
        {
            if(A[i] < A[j])
                C[k++] = A[i++];
            else
                C[k++] = A[j++];
        }

        for(; i <= mid; i++)
            C[k++] = A[i++];

        for(; j <= h; j++)
            C[k++] = A[j++];
            
        for(i=l; i<=h; i++)
            A[i]=C[i];
    }

    static void iMergeSort(int[] A, int n)
    {
        int p,i,l,h,mid;

        for(p=2; p<=n; p=p*2)
        {
            for(i=0; i+p-1<n; i+=p)
            {
                l=i;
                h=i+p-1;
                mid=Math.floorDiv((l+h), 2);
                merge(A, l, mid, h);
            }
        }

        if(p/2 < n)
            merge(A, 0, (p/2), n-1);
    }

    static void rMergeSort(int[] A, int l, int h)
    {
        if(l<h)
        {
            int mid=Math.floorDiv((l+h), 2);
            rMergeSort(A, l, mid);
            rMergeSort(A, mid+1, h);
            merge(A, l, mid, h);
        }
    }

    public static void main(String[] args) {
        int[] A={8,3,7,4,9,2,6,5};

        // iMergeSort(A, A.length);
        rMergeSort(A, 0, A.length-1);

        for(int n: A)
        {
            System.out.print(n+" ");
        }
    }
}
