package Summer.google;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestWordInDictionaryThroughDeleting {
    public String findLongestWord(String s, List<String> dictionary)
    {
        Collections.sort(dictionary,(a,b)->a.length()!=b.length()?b.length()-a.length():a.compareTo(b));
//        Collections.sort(dictionary, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length()!=o2.length())
//                {
//                    return o2.length()-o1.length();
//                }
//                else{
//                    return o1.compareTo(o2);
//                }
//
//            }
//        });
String res="";
        for(String each:dictionary)
        {
            int i=0;
            for(char each1:s.toCharArray())
            {
                if(i<each.length() && each.charAt(i)==each1)
                {
                    i++;
                }
            }
            if(i==each.length())
            {
                return each;
            }
        }
        return "";


    }
}
