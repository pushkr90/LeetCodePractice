package Summer.google;

import java.util.*;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String each:words)
        {
            map.put(each,map.getOrDefault(each,0)+1);
        }
        List<String> res=new ArrayList<>(map.keySet());

        Collections.sort(res, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1)==map.get(o2)?o1.compareTo(o2):map.get(o2)-map.get(o1);
            }
        });

        return res.subList(0,k);
    }
}
