package Summer.google;

import java.util.HashMap;

public class StringTransformsToAnotherString {
    public boolean canConvert(String str1, String str2) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<str1.length();i++)
        {
            char atStr1=str1.charAt(i);
            char atStr2=str2.charAt(i);
            if(!map.containsKey(atStr1))
            {
                map.put(atStr1,atStr2);
            }
            else{
                char replacement=map.get(atStr1);
                if(replacement!=atStr2)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
