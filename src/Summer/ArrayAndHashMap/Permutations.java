package Summer.ArrayAndHashMap;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();

        helper(res,nums,new ArrayList<>());
        return res;

    }

    private void helper(List<List<Integer>> res, int[] nums, List<Integer> current)
    {
        if(current.size()==nums.length)
        {
            res.add(new ArrayList<>(current));
            return;
        }
        if(current.size()>nums.length)
        {
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(current.contains(nums[i])) continue;
            current.add(nums[i]);
            helper(res,nums,current);
            current.remove(current.size()-1);
        }
    }
}
