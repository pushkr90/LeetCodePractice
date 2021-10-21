package facebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NumberOfIslandsBFS {

    public static int solution(String[] A)
    {
        int max=0;
        int i=0;
        String str="";
        while(i<A.length)
        {
            if(check(A[i]))
            {
                str+=A[i];
            }
            else
            {
                String reverse = new StringBuilder(A[i]).reverse().toString();
                int j=0;
                while(j<A.length)
                {
                    if(i==j)
                    {
                        continue;
                    }
                    if(A[j].equals(reverse))
                    {
                        str+=A[j]+A[i];
                    }
                }
                j++;
            }
            max = Math.max(max,str.length());
            i++;
        }
        return max;
    }

    private static boolean check(String con)
    {
        int start=0,end=con.length()-1;
        while(start<end)
        {
            if(con.charAt(start)!=con.charAt(end))
            {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }

    public static void main(String[] args) {
        String[]A=new String[]{"so", "oo", "kk", "od"};
        System.out.println(solution(A));
    }
}


