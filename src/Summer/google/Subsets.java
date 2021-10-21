package Summer.google;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> res=new ArrayList<>();
        dfs(0,nums,res,new ArrayList<>());
        return res;
    }
    private void dfs(int start,int[]nums,List<List<Integer>>res,List<Integer> temp)
    {
        if(temp.size()>nums.length)
        {
            return;
        }
        res.add(new ArrayList<>(temp));


        for(int i=start;i<nums.length;i++)
        {
            temp.add(i);
            dfs(i+1,nums,res,temp);
            temp.remove(temp.size()-1);

        }

    }
}
