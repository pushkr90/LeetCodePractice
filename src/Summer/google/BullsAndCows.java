package Summer.google;

import java.util.*;

public class BullsAndCows {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap<>();
        int bulls=0,cows=0;
        for (int i = 0; i < guess.length(); i++) {
            if(secret.charAt(i)==guess.charAt(i))
            {
                bulls++;
            }
            else
            {
                map.put(secret.charAt(i),map.getOrDefault(secret.charAt(i),0)+1);
            }
        }

        for(int i=0;i<guess.length();i++)
        {
            if(map.containsKey(guess.charAt(i))&& guess.charAt(i)!=secret.charAt(i))
            {
                if(map.get(guess.charAt(i))>0)
                {
                    cows++;
                    map.put(guess.charAt(i),map.get(guess.charAt(i))-1);
                }

            }
        }

        StringBuilder sb=new StringBuilder();
        sb.append(bulls).append("A").append(cows).append("B");
        return sb.toString();

    }
}
/*
*secret = "1123", guess = "0111"
*
* 1-0,1
* 2-2
* 3-3
* cows1
* bulls1
*
* for(int i=0;i<guess.length;i++)
* {
* int bulls=0;
*   char c=guess.charAt(i);
*   List<Integer> res=map.get(c);
*
* for(int j=0;j<res.size();j++)
* {
*   if(i==res.get(j))
*   {
*      bulls++;
*       res.remove(j);
*   }
*  }
* }
*
* */