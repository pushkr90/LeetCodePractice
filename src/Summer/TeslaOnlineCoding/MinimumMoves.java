package Summer.TeslaOnlineCoding;
/*
* Description
Given a string S consisting of N letters 'a' or 'b'. In one move, you can swap one letter for the other ('a' for 'b' or 'b' for 'a').
* You should return the minimum number of moves required to obtain a string containing no instances of three identical consecutive letters
* */
public class MinimumMoves
{
    public int MinimumMoves(String S)
    {
        int res=0;
        int len=0;
        for(int i=0;i<S.length()-1;i++)
        {
            if(S.charAt(i)==S.charAt(i+1))
            {
                len++;
                if(len==3)
                {
                    len=0;
                    res++;
                }
            }
            else if(S.charAt(i)!=S.charAt(i+1))
            {
                len=1;
            }
        }
        return res;

    }

}
