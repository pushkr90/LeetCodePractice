package Summer.tesla;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfaPhoneNumber
{
    public List<String> letterCombinations(String digits)
    {
        List<String> res=new ArrayList<>();

        String[] arr= new String[]{"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        dfs(arr,"",digits,res,0);
        return res;
    }

    public void dfs(String[] arr,String pushkar,String digits,List<String> res,int index)
    {
        if(index==digits.length())
        {
            res.add(pushkar);
            return;
        }
        String letter=arr[digits.charAt(index)-'0'];
        for(int i=0;i<letter.length();i++)
        {
            dfs(arr,pushkar+letter.charAt(i),digits,res,index+1);
        }
    }
}
