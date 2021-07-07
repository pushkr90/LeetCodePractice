package Summer.Design;

import java.util.HashMap;
import java.util.Map;

public class TimeBasedKeyValueStore {
    Map<String,String> map;
    public TimeBasedKeyValueStore() {
        map=new HashMap<>();

    }

    public void set(String key, String value, int timestamp) {
        String newKey=key+timestamp;

        if(!map.containsKey(newKey))
        {
            map.put(newKey,value);
        }

    }

    public String get(String key, int timestamp) {
        String key1=key+timestamp;
        if(map.containsKey(key1))
        {
            return map.get(key1);
        }
        else{
            while(timestamp!=0) {
                timestamp--;
                key1=key+timestamp;
                if (map.containsKey(key1))
                {
                    return map.get(key1);
                }
            }

        }
        return "";

    }
}
