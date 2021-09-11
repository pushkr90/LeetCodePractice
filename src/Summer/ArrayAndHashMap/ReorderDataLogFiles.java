package Summer.ArrayAndHashMap;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderDataLogFiles {
    public String[] reorderLogFiles(String[] logs)
    {
       Arrays.sort(logs, new Comparator<String>()
       {
           @Override
           public int compare(String o1, String o2)
           {
               String[] res=o1.split(" ",2);
               String[] res1=o2.split(" ",2);
               boolean isDigit=Character.isDigit(res[1].charAt(0));
               boolean isDigit1=Character.isDigit(res1[1].charAt(0));

               if(!isDigit && !isDigit1)
               {
                   int comp=res[1].compareTo(res1[1]);
                   if(comp!=0)
                   {
                       return comp;
                   }

                   return res[0].compareTo(res1[0]);
               }
                if(!isDigit && isDigit1)
               {
                   return -1;
               }
                else if(isDigit && !isDigit1)
                {
                    return 1;

                }
                else{return 0;}



           }
       });
       return logs;
    }
}
