package Summer.google;

public class SqaureOfSortedArray {
    public int[] sortedSquares(int[] nums) {

        int[] res=new int[nums.length];
        int right=nums.length-1;
        int left=0;
        for(int i=nums.length-1;i>=0;i--)
        {

            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
                res[i]=nums[left]*nums[left];
            }
            else{
                res[i]=nums[right]*nums[right];
            }
        }

        return res;

    }
}
