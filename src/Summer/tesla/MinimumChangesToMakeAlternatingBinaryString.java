package Summer.tesla;

public class MinimumChangesToMakeAlternatingBinaryString
{
    public int minOperations(String s)
    {
        char[] arr=s.toCharArray();
        if (s == null || s.length() == 0)
            return 0;
        char next=arr[0]=='0'?'1':'0';
        int res=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=next)
            {
                res++;
            }
            next=s.charAt(i)=='0'?'1':'0';
        }
        return Math.min(res,s.length()-res);


    }
}
