package Summer.tesla;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKsortedArray {
    public class ListNode {
      int val;
    ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeKLists(ListNode[] lists) {

            PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1-o2;
                }
            });
            for(ListNode each:lists)
            {
                while(each!=null)
                {
                    pq.add(each.val);
                    each=each.next;
                }
            }
            ListNode dummy=new ListNode(0);
            ListNode head=dummy;
            while(!pq.isEmpty())
            {
               ListNode  node=new ListNode(pq.remove());
               head.next=node;
                head=head.next;

            }
            return dummy.next;
    }
}
