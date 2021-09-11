package Summer.ArrayAndHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
    List<int[]> res=new ArrayList<>();
        Arrays.sort(firstList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        Arrays.sort(secondList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
    int i=0,j=0;
    while(i<firstList.length && j<secondList.length)
    {
        int maxStart=Math.max(firstList[i][0],secondList[j][0]);
        int minEnd=Math.min(firstList[i][1],secondList[j][1]);
        if(maxStart<=minEnd) {
            res.add(new int[]{maxStart, minEnd});
        }
        if(firstList[i][1]<=secondList[j][1])
        {
            i++;
        }else{j++;
        }

    }

    return res.toArray(new int[res.size()][]);
    }
}
