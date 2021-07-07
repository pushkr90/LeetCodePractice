package Summer.ArrayAndHashMap;

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
            while(j>=0 && nums[i]>=nums[j])
            {
                j--;
            }
            swap(i,j,nums);
        }
       reverse(nums,i+1);
    }
    private void reverse(int[]nums,int start)
    {
        int end=nums.length-1;
        while(start<end)
        {
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }

    }
    private void swap(int i,int j,int []nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
