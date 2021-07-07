package Summer.ArrayAndHashMap;

import java.util.HashMap;

public class isAlienSorted {
    public boolean isAlienSorted(String[] words, String order) {

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<order.length();i++)
        {

                map.put(order.charAt(i),i);

        }

        for(int i=0;i<words.length;i++)
        {
            String each=words[i];
            String each1=words[i+1];

            for(int j=0;j<each.length();j++)
            {
                if(j>=each1.length())
                {
                    return false;
                }
                if(map.get(each.charAt(j))!=map.get(each1.charAt(j)))
                {
                    return false;
                }
            }
        }
        return true;

    }
}
