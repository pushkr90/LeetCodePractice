package Summer.ArrayAndHashMap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Kcloset
{
    public int[][] kClosest(int[][] points, int k)
    {


        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]));

        for(int[] each:points)
        {
            pq.add(each);
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
