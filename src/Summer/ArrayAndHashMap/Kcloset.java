package Summer.ArrayAndHashMap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Kcloset
{
    public int[][] kClosest(int[][] points, int k)
    {
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int o1distance=o1[0]*o1[0]+o1[1]*o1[1];
                int o2distance=o2[0]*o2[0]+o2[1]*o2[1];
                return o1distance-o2distance;
            }
        });

        for(int[] each:points)
        {
            pq.add(each);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int[][] res=new int[k][2];

        for(int i=0;i<k;i++)
        {
            int[] newArr = pq.poll();
            res[i]=newArr;
        }
        return res;


    }
}
