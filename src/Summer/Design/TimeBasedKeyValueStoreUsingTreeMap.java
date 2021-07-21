package Summer.Design;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeBasedKeyValueStoreUsingTreeMap {
    Map<String, TreeMap<Integer,String>> map;
    public TimeBasedKeyValueStoreUsingTreeMap() {
        map=new HashMap<>();

    }

    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))
        {
            map.put(key,new TreeMap<>());
        }
        TreeMap<Integer,String> tMap=map.get(key);
        tMap.put(timestamp,value);
        map.put(key,tMap);

    }

    public String get(String key, int timestamp) {
        TreeMap<Integer,String> tMap=new TreeMap<>();
        tMap=map.get(key);
        Integer keyVAL=0;
        if(tMap!=null)
        {
             keyVAL=tMap.floorKey(timestamp);
        }
        return tMap.get(keyVAL)!=null?tMap.get(keyVAL):"";
    }
}
