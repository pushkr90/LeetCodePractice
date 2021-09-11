package Summer.tesla;

public class LargestNumber {
    public String largestNumber(int[] nums) {

        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<nums.length;i++)
        {

            for(int j=i+1;j<nums.length;j++)
            {
                String ij=nums[i]+""+nums[j];
                String ji=nums[j]+""+nums[i];
                if(Double.parseDouble(ji)>Double.parseDouble(ij))
                {
                    swap(i,j,nums);
                }

            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<nums.length;i++)
        {
            res.append(nums[i]);

        }
        return res.toString();

    }
    private void swap(int start,int end,int[]nums)
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;

    }
}
