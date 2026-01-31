public class BubbleSort{

    static void bubbleSort(int[] nums, int n)
    {
        for(int i=0; i<n-1; i++)
        {
            boolean flag=false;
            for(int j=0; j<n-1-i; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    // Swapping 
                    nums[j]=nums[j]+nums[j+1] - (nums[j+1]=nums[j]);
                    flag=true;
                }
            }
            if(!flag)
            {
                break;
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] arr={8, 5, 7, 3, 2};

        bubbleSort(arr, arr.length);

        for(int num: arr)
        {
            System.out.print(num+" ");
        }
    }
}