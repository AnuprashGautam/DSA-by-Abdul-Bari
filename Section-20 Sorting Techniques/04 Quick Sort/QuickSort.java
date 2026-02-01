public class QuickSort {

    static int partition(int[] nums, int l, int h)
    {
        int pivot = nums[l];
        int i=l;
        int j=h;

        do
        {
            // Shift the i to right
            do{i++;}while(nums[i]<=pivot);
            // Shift the j to left
            do{j--;}while(nums[j]>pivot);

            if(i<j)
            {
                // Swaping the ith and jth elements nums[i]<-->nums[j]
                nums[i]=nums[i]+nums[j]-(nums[j]=nums[i]);
            }
        }while(i<j);

        // Swaping the pivot with jth element nums[l] <--> nums[j]
        nums[l]=nums[l]+nums[j]-(nums[j]=nums[l]);

        return j;
    }

    static void quickSort(int[] nums, int l, int h )
    {
        int j;

        if(l < h){
            j = partition(nums, l, h);
            quickSort(nums, l, j);
            quickSort(nums, j+1, h);
        }
    }
    
    public static void main(String[] args) {
        int[] nums={23,1,0,2,67,10,56, Integer.MAX_VALUE};

        quickSort(nums, 0, nums.length-1);

        for(int i=0; i<nums.length-1; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
