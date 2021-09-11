package Summer.ArrayAndHashMap;

import java.util.HashSet;

public class NumberOfGoodWaysToSplitAString {
    public int numSplits(String s)
    {
        int res=0;
        int end=s.length();
        HashSet<Character> set=new HashSet<>();
        HashSet<Character>set1=new HashSet<>();
        for(int i=1;i<s.length();i++)
        {
            String s1=s.substring(0,i);
            String s2=s.substring(i,end);

            for(char each:s1.toCharArray())
            {
                set.add(each);
            }
            for(char each:s2.toCharArray())
            {
                set1.add(each);
            }
            if(set.size()== set1.size())
            {
                res++;
            }

        }
        return res;
    }
}
