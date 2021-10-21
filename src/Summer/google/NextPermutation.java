package Summer.google;

public class NextPermutation {
    public void nextPermutation(int[] nums)
    {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j=nums.length-1;
            while(nums[i]>=nums[j])
            {
                j--;
            }

            swap(nums,i,j);
        }
        reverse(nums,i);
    }

    private void swap(int[]nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    private void reverse(int[] nums,int start)
    {
        int end=nums.length-1;
        while(start<end)
        {
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }

    }
}
