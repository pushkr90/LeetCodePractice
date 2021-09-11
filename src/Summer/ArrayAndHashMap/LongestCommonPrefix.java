package Summer.ArrayAndHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LongestCommonPrefix
{
    public String longestCommonPrefix(String[] strs)
    {
        String res="";
        HashMap<Character, List<Integer>> map=new HashMap<>();

        String ref=strs[0];

        for(int i=1;i< strs.length;i++)
        {
            while(strs[i].indexOf(ref)!=0)
            {
                ref.substring(0,ref.length()-1);
            }
        }
        return ref;

    }
}
