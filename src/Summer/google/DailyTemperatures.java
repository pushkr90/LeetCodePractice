package Summer.google;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int res[]=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && temperatures[i]>=temperatures[stack.peek()])
            {
                stack.pop();
            }
            if(!stack.isEmpty() && temperatures[i]<temperatures[stack.peek()])
            {
                res[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return res;

    }
}

