public class BinarySearch {
    public static int doBinSearch(int[] arr, int l, int h, int k)
    {
        if(l > h)
        {
            return -1;
        }

        int mid= (l+h)/2;

        if(arr[mid]==k) 
        {
            return mid;
        }
        else if ( arr[mid] > k)
        {
            return doBinSearch(arr, l, mid-1, k);
        }
        else
        {
            return doBinSearch(arr, mid+1, h, k);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-12, -8, -6, -1, 3, 6, 8 , 11, 14, 17, 20, 22, 25 , 29, 31};

        System.out.println(doBinSearch(arr, 0, arr.length-1, 6));
    }
}
