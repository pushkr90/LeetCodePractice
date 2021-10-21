package Summer.vmWare;

import java.util.Stack;

public class ScoreOfParentheses {
    public int scoreOfParentheses(String s) {
        int score=0;
        Stack<Integer> stack=new Stack<>();

        for(char each:s.toCharArray())
        {
            if(each=='(')
            {
                stack.push(score);
                score=0;
            }
            else{
                score= stack.pop()+Math.max(score*2,1);
            }
        }
        return score;
    }
}
