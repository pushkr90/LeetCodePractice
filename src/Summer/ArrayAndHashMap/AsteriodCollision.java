package Summer.ArrayAndHashMap;

import java.util.Stack;

public class AsteriodCollision {
    public int[] asteroidCollision(int[] asteroids)
    {
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i]>0)
            {
                stack.push(asteroids[i]);
            }
            else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(asteroids[i]))
                {
                    stack.pop();
                }
                if(stack.isEmpty()||stack.peek()<0)
                {
                    stack.push(asteroids[i]);
                }
                else if(stack.peek()==Math.abs(asteroids[i]))
                {
                    stack.pop();
                }
            }
        }

        int[] res=new int[stack.size()];

        for(int i=0;i<stack.size();i++)
        {
            res[i]=(stack.pop());
        }
        return res;
    }
}
