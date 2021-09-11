package Summer.Design;

import java.util.Collections;
import java.util.PriorityQueue;

public class findMedianFromDataStream {
    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;
    boolean even;
    public findMedianFromDataStream()
    {
        max=new PriorityQueue<>((a,b)->b-a);
       // max=new PriorityQueue<>(Collections.reverseOrder());
        min=new PriorityQueue<>();
        even=true;
    }

    public void addNum(int num)
    {
        if(even)
        {
           max.add(num);
           min.add(max.poll());
        }
        else{
            min.add(num);
            max.add(min.poll());
        }
        even=!even;

    }

    public double findMedian()
    {
        if(even)
        {
            return (double) ((max.peek()+min.peek())*0.5);
        }else{
            return (double)(min.peek());
        }

    }
}
