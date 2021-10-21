package Summer.google;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumTHREE {
    public List<List<Integer>> combinationSum3(int k, int n)
    {
        List<List<Integer>> res=new ArrayList<>();

        dfs(res,new ArrayList<>(),k,n,1);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> temp, int k, int total, int start)
    {
        if(total==0 &&temp.size()==k)
        {
            res.add(new ArrayList<>(temp));
            return;
        }

        if(total<0 ||temp.size()>k)
        {
            return;
        }
        for(int i=start;i<=9 ;i++)
        {
            temp.add(i);
            dfs(res,temp,k,total-i,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
