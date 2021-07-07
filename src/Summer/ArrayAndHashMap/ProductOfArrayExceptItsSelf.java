package Summer.ArrayAndHashMap;

public class ProductOfArrayExceptItsSelf {
    public int[] productExceptSelf(int[] nums)
{
    int [] res=new int[nums.length];
    int left=1,right=1;
    for(int i=0;i<nums.length;i++)
    {
        if(i>0)
        {
            left*=nums[i-1];
        }
        res[i]=left;
    }

    for(int i=nums.length-1;i>=0;i--)
    {
        if(i<nums.length-1)
        {
            right*=nums[i+1];
        }
        res[i]*=right;
    }
    return  res;

}

}
