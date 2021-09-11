package Summer.ArrayAndHashMap;

import java.util.HashSet;

public class ValidPalindromeTWO {
    public boolean validPalindrome(String s)
    {
        int start=0;
        int end=s.length()-1;
        String s1="";

        while(start<end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
            }else{
               return check(start+1,end,s)||check(start,end-1,s);
            }
        }
        return true;

    }
    public boolean check(int start,int end,String s)
    {
        while(start<end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
