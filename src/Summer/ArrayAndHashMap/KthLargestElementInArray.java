package Summer.ArrayAndHashMap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1-o2;
            }
        });
                for(int each:nums)
                {
                    pq.add(each);
                    if(pq.size()>k)
                    {
                        pq.poll();
                    }
                }

                return pq.poll();
    }

    }
