package Summer.google;

import java.util.HashMap;

public class ExpressiveWords {
    public int expressiveWords(String s, String[] words) {
       int res=0;
       for(String each:words)
       {
           if(check(s,each))
           {
               res++;
           }
       }
       return res;
    }

    private boolean check(String s,String each)
    {
        int p1=0,p2=0;
        while(p1<s.length() && p2<each.length())
        {
            int c1=0,c2=0;
            if(s.charAt(p1)!=each.charAt(p2))
            {
                return false;
            }
            char c=s.charAt(p1);
            while(s.charAt(p1)==c && p1<s.length())
            {
                c1++;
                p1++;
            }
            char ch=each.charAt(p2);
            while (p2<each.length() && each.charAt(p2)==ch)
            {
                c2++;
                p2++;
            }
            if(c2>c1||(c1>3 && c2!=c1)) return false;
        }
        if(p1<s.length()||p2<each.length()) return false;
        return true;
    }
}
