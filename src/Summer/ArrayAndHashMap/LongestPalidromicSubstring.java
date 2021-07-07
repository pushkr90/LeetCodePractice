package Summer.ArrayAndHashMap;

public class LongestPalidromicSubstring
{
    public String longestPalindrome(String s)
    {

        String longest="";
        for(int i=0;i<s.length();i++)
        {
            String even=check(i,i+1,s);
            String odd=check(i,i,s);
            if(even.length()>odd.length())
            {
                longest=even;
            }else{
                longest=odd;
            }
        }
        return longest;
    }
    public String check(int start,int end,String s)
    {
        while(end<s.length() && start>=0 && s.charAt(start)==s.charAt(end))
        {
            end++;
            start--;
        }
        return s.substring(start+1,end);
    }
}
