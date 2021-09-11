package Summer.google;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CarFleetRevision {
    public int carFleet(int target, int[] position, int[] speed)
    {
        Map<Integer,Double> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<position.length;i++)
        {
            map.put(position[i],(double)(target-position[i])/speed[i]);
        }

        int res=0;
        double min=0.0;
        for(double each:map.values())
        {
            if(min<each)
            {
                res++;
                min=each;
            }
        }
        return res;
    }
}
