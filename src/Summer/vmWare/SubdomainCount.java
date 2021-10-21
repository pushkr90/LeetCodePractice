package Summer.vmWare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainCount {
    public List<String> subdomainVisits(String[] cpdomains)
    {
        HashMap<String,Integer> map=new HashMap<>();

        for(String each:cpdomains)
        {
            String[] arr=each.split("\\s+");
            String[] arr2=arr[1].split("\\.");

            int count=Integer.valueOf(arr[0]);
            String prepare="";
            for(int i=arr2.length-1;i>=0;i--)
            {

                String curr=(i==arr2.length-1?"":".");
                prepare=arr2[i]+curr+prepare;


                if(!map.containsKey(prepare))
                {
                    map.put(prepare,count);
                }
                map.put(prepare,map.get(prepare)+count);
            }
        }

        List<String> res=new ArrayList<>();

        for(Map.Entry<String,Integer> each:map.entrySet())
        {
            int val=each.getValue();
            String key= each.getKey();
            res.add(val+" "+key);
        }
        return res;
    }
}
