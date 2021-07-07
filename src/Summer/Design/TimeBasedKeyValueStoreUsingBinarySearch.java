package Summer.Design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStoreUsingBinarySearch
{
    class pair{
        int time;
        String val;
        public pair(int time,String val)
        {
            this.time=time;
            this.val=val;
        }
    }
    Map<String, List<pair>> map;
    public TimeBasedKeyValueStoreUsingBinarySearch() {
        map=new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) {

            map.put(key,new ArrayList<>());
        }
        List<pair> res=map.get(key);
        pair nwPair = new pair(timestamp,value);
        res.add(nwPair);
        map.put(key,res);

    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
        {
            return "";
        }
        int start=0;
        int end=map.get(key).size();
        List<pair> res=map.get(key);
        return helper(start,end-1,res,timestamp);
    }

    public String helper(int start, int end, List<pair> res, int timestamp)
    {
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(timestamp==res.get(mid).time)
            {
                return res.get(mid).val;
            }
            else if(res.get(mid).time<timestamp)
            {
                if(res.get(mid+1).time>timestamp)
                {
                    return res.get(mid+1).val;
                }else{
                    start=mid+1;
                }
            }
            else{
                end=mid;
            }

        }
        return res.get(start).time<=timestamp?res.get(start).val:"";

    }
}
