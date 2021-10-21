package Summer.Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges
{
    public int orangesRotting(int[][] grid)
    {
        int res=0;
        int[][] dir=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int fresh=0;
        Queue<int[]> qu=new LinkedList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;i<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    qu.offer(new int[]{i,j});
                }
                if(grid[i][j]==1)
                {
                  fresh++;
                }
            }
        }
        //int res=0;
        if(fresh==0) return 0;

        while(!qu.isEmpty())
        {
            int size=qu.size();
            res++;


            for(int i=0;i<size;i++)
            {
                int[] curr=qu.poll();
                for(int[] each:dir)
                {
                    int newX=each[0]+curr[0];
                    int newY=each[1]+curr[1];
                    if(newX>=0 && newX<grid.length && newY>=0 && newY<grid[0].length&& grid[newX][newY]==1)
                    {
                        fresh--;
                        grid[newX][newY]=2;
                        qu.offer(new int[]{newX,newY});
                    }
                }
            }
        }

        return fresh==0?res:-1;

    }
}
