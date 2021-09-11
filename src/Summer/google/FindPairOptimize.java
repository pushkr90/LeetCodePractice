package Summer.google;

import java.util.*;

public class FindPairOptimize {
    class pair  {
        long first, second;
        public pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }
    }
    public pair[] allPairs( long A[], long B[], long N, long M, long X)
    {
        HashSet<Long> set=new HashSet<>();

        for(long each: B)
        {
            set.add(each);
        }

        // pair[] res=new pair[];
        List<pair> list = new ArrayList<>();

        for(long each:A)
        {
            long val = X-each;
            if(set.contains(val))
            {
                list.add(new pair(val,each));
                // pair[] interior=new pair(set.get(i),A[i]);
                // res.add(interior);
            }
        }
        Collections.sort(list, new Comparator<pair>() {
            @Override
            public int compare(pair o1, pair o2) {
                return  Long.valueOf ( o1.first).compareTo(o2.first);
            }
        });
        return list.toArray(new pair[list.size()]);
    }
}
/**
 arr1[] = {-1, -2, 4, -6, 5, 7}
 arr2[] = {6, 3, 4, 0}

 target=8;
 0 6
 1 3
 2 4
 3 0

 for(int i=0;i<arr1.length;i++)
 {
    if(map.containsKey(arr[i]-target){
    res.add(new int[]{arr1[i],map,get(arr[i]-target};
 }
 }




* */
