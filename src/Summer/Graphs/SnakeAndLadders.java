package Summer.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeAndLadders {
    public int snakesAndLadders(int[][] board) {
        int[] board1=new int[board.length  *board[0].length+1];
        int count=1;
        boolean dir=true;
        for(int i=0;i<board.length;i++)
        {
            if(dir) {
                for (int j = 0; j < board[i].length; j++) {
                    board1[count] = board[i][j];
                    count++;
                }

            }
            else {
                for(int j=board[i].length-1;j>=0;j--)
                {
                    board1[count]=board[i][j];
                    count++;
                }
            }
            dir=!dir;
        }

        Queue<helper> qu=new LinkedList<>();
        boolean[]visited=new boolean[board1.length+1];
        helper h1=new helper(1,0);
        qu.offer(h1);
        while(!qu.isEmpty())
        {
            h1=qu.poll();
            visited[h1.vertex]=true;
            if(h1.vertex==board1.length-1) return h1.moves;

            for(int k=1;k<=6;k++)
            {
                int currVertex=h1.vertex+k;
                if(currVertex<=36 && !visited[currVertex])
                {
                    if(board1[currVertex]!=-1)
                    {
                        qu.offer(new helper(board1[currVertex],h1.moves+1));

                    }
                    else {
                        qu.offer(new helper(currVertex,h1.moves+1));
                    }
                }
            }
        }
        if(h1.vertex!=board1.length-1)
        {
            return -1;
        }
        return h1.moves;

    }

    class helper
    {
        int vertex;
        int moves;
        public helper(int vertex,int moves)
        {
            this.vertex=vertex;
            this.moves=moves;
        }

    }
}
