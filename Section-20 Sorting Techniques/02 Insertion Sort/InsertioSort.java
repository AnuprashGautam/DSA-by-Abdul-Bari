public class InsertioSort
{
    static void insertionSort(int[] arr, int n)
    {
        for(int i=1; i<n; i++)
        {
            int ele = arr[i];
            int j=i-1;
            // Shifting the elements
            while(j>-1 && arr[j]>ele)
            {
                arr[j+1]=arr[j];
                j--;
            }
            // Inserting the element
            arr[j+1]=ele;
        }
    }
    public static void main (String[] args)
    {
        int[] arr= {8, 5, 7, 3, 2};

        insertionSort(arr, arr.length);

        for(int num: arr)
        {
            System.out.print(num+" ");
        }
    }
}