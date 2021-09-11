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
    private boolean check(String Strenchy,String each)
    {
        int p1=0,p2=0;

        while(p1<Strenchy.length() && p2<each.length())
        {
            int c1=0,c2=0;
            if(Strenchy.charAt(p1)!=each.charAt(p2))
            {
                return false;
            }
            char ch=Strenchy.charAt(c1);
            while(p1<Strenchy.length() && Strenchy.charAt(p1)==ch )
            {
                c1++;
                p1++;
            }

            while(p2<each.length() && each.charAt(p2)==ch)
            {
                p2++;
                c2++;
            }

            if(c2>c1||(c1<3 && c1!=c2)) return false;
        }

        if(p2<each.length() ||p1<Strenchy.length()) return  false;
        return true;
    }
}
