package Summer.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class TheMaze {
    public boolean hasPath(int[][] maze, int[] start, int[] destination)
    {
        Queue<int[]> qu=new LinkedList<>();

        int[][]dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
       boolean[][]visited=new boolean[maze.length][maze[0].length];
        qu.offer(start);

        while(!qu.isEmpty())
        {
            int[]curr=qu.poll();
            visited[curr[0]][curr[1]]=true;
            if(curr[0]==destination[0] &&curr[1]==destination[1]) return true;

            for(int[]each:dirs)
            {
                int newX=each[0]+curr[0];
                int newY=each[1]+curr[1];

                while(newX>=0 &&newX<maze.length && newY>=0 && newY<maze[0].length && !visited[newX][newY] &&maze[newX][newY]!=-1)
                {
                    newX=each[0];
                    newY=each[1];
                }
                if(!visited[newX][newY])
                {
                    qu.offer(new int[]{newX,newY});
                }
            }
        }
        return false;


    }
}
