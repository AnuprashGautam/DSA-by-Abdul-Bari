public class SelectionSort {
    static void selectionSort(int[] arr, int n)
    {
        for(int i=0; i<n-1; i++)
        {
            int j=i;
            int k=i;

            while(j!=n)
            {
                if(arr[j] < arr[k])
                {
                    // Updating the index k
                    k=j;
                }
                j++;
            }
            //Swap the ith and kth elements
            arr[i]=arr[i]+arr[k]-(arr[k]=arr[i]);
        }
    }
    public static void main(String[] args) {
        int [] arr= {8,6,3,10,9,4,12,5,2,7};

        SelectionSort.selectionSort(arr, arr.length);

        for(int num: arr)
        {
            System.out.print(num+" ");
        }
    }
}
