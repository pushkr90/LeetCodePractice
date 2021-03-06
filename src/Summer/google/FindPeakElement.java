package Summer.google;

public class FindPeakElement
{
    public int findPeakElement(int[] nums)
    {

        int start=1,end=nums.length-2;

        //if(nums.length==0) return 0;
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;


        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            else
            {
                if(nums[mid]<nums[mid-1])
                {
                    end=mid-1;
                }
                else if(nums[mid]<nums[mid+1])
                {
                    start=mid+1;
                }
            }
        }

        return 0;



    }
}
/*
*1,2,1,3,5,6,4
*
*
* */
