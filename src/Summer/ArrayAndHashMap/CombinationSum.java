package Summer.ArrayAndHashMap;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum
{
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> list=new ArrayList<>();

        if(candidates.length==0) return list;
        helper(candidates,list,new ArrayList<Integer>(),target,0,0);
        return list;


    }

    private void helper(int[] candidates,List<List<Integer>>list, ArrayList<Integer> current,int target,int curSum,int index)
    {

        if(curSum==target)
        {
            list.add(current);
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            current.add(candidates[i]);
            helper(candidates,list,current,target,candidates[i]+curSum,i+1);
            current.remove(current.size()-1);
        }

    }
}
