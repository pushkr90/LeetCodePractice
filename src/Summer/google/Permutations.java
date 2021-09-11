package Summer.google;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();

        helper(res,new ArrayList<>(),nums);

        return res;
    }

    public void helper(List<List<Integer>>res,List<Integer> pushkar,int[] nums)
    {
        if(pushkar.size()==nums.length)
        {
            res.add(new ArrayList<>(pushkar));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(pushkar.contains(nums[i])) continue;
            pushkar.add(nums[i]);
            helper(res,pushkar,nums);
            pushkar.remove(pushkar.size()-1);

        }
    }

}
