package Summer.ArrayAndHashMap;

public class SearchInRotated {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;

        int start = 0, end = nums.length - 1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>=nums[start])
            {
                if(target>nums[start]&& target<nums[mid])
                {
                    end=mid;
                }
                else{
                    start=mid+1;
                }
            }
            else if(nums[mid]<nums[end])
            {
                if(target>nums[mid] && target<nums[end])
                {
                    start=mid+1;
                }
                else{
                    end=mid;
                }
            }
        }
        return -1;

    }
}
