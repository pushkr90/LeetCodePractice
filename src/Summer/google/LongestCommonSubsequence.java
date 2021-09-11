package Summer.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2)
    {
        HashMap<Character, List<Integer>> map=new HashMap<>();
        for(int i=0;i<text1.length();i++)
        {
            if(!map.containsKey(text1.charAt(i)))
            {
                map.put(text1.charAt(i),new ArrayList<>());
            }
            map.get(text1.charAt(i)).add(i);
        }

        int max=0;
        int tempval=0;
        for(int i=0;i<text2.length();i++)
        {
            char c=text2.charAt(i);

            if(map.containsKey(c))
            {
                List<Integer> temp=map.get(c);
                int val=0;
                for (int j=0;j<temp.size();j++)
                {
                   val=temp.get(j);
                    if(val>tempval){
                        max++;//1
                    }

                }
                tempval=val;

            }
        }
        return max;

    }
}
/*
abcde
a-0 b-1 c-2 d-3 e-4

a-0 c-1 e-2

:ace
*/
