package Summer.google;

public class FirstAndLastPositionInaSortedArray {
    public int[] searchRange(int[] nums, int target)
    {
    int start=0;
    int end=nums.length-1;

    int res=-1;
    res=search(nums,target,start,end,res);
    int res1=-1;
    res1=search1(nums,target,start,end,res1);
    int[] result=new int[2];
    result[0]=res;
    result[1]=res1;
    return result;


    }

    private int search1(int[]nums,int target,int start,int end,int res1)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==nums[mid])
            {
                res1=mid;
                start=mid+1;

            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res1;
    }

    private int search(int[]nums,int target,int start,int end,int res)
    {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid])
            {
                res=mid;
                end=mid-1;

            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;

    }
}
