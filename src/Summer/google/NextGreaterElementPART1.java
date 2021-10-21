package Summer.google;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementPART1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(int each:nums2)
        {
            while(!stack.isEmpty() && each>stack.peek())
            {
                map.put(stack.pop(),each);
            }
            stack.push(each);
        }

        for(int i=0;i<nums1.length;i++)
        {
            if(map.containsKey(nums1[i]))
            {
                nums1[i]=map.get(nums1[i]);
            }
            else
            {
                nums1[i]=-1;
        }
        }
        return nums1;
    }
}
