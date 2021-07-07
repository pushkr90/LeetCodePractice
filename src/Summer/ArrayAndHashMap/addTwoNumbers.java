package Summer.ArrayAndHashMap;

import Summer.ListNode;

public class addTwoNumbers
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            int sum=0;
            if(l1!=null && l2!=null)
            {
                sum+=(l1.val+l2.val);
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1!=null && l2==null)
            {
                sum+=(l1.val);
                l1=l1.next;
            }
            else if(l1==null && l2!=null)
            {
                sum+=(l2.val);
                l2=l2.next;
            }
            sum+=carry;
            carry=(sum)/10;
            ListNode n=new ListNode(sum%10);
            temp.next=n;
            temp=temp.next;
        }
        return dummy.next;

    }
}
