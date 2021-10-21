package Summer.GOOGLELEETCODEEXPLORER;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
    List<String> res=new ArrayList<>();

    dfs(res,0,0,"",n);
    return res;

    }

    private void dfs(List<String>res,int start,int end,String ans,int n)
    {
        if(ans.length()==n*2)
        {
            res.add(ans);
            return;
        }
        if(start<n)
        {
            dfs(res,start+1,end,ans+"(",n);
        }
        if(end<start)
        {
            dfs(res,start,end+1,ans+")",n);
        }


    }
}
