package Summer.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslandBFS
{
    int[][]dirs={{0,1},{0,-1},{1,0},{-1,0}};
    int res=0;
    public int numIslands(char[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        Queue<int[]> qu=new LinkedList<>();

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    res++;
                    qu.offer(new int[]{i,j});
                    grid[i][j]='0';
                    while (!qu.isEmpty())
                    {
                        int [] curr=qu.poll();
                        for(int [] each:dirs)
                        {
                            int newRow=curr[0]+each[0];
                            int newCol=curr[1]+each[1];
                            if(newRow>=0 && newRow<grid.length && newCol>=0 && newCol<grid[0].length && grid[newRow][newCol]=='1')
                            {
                                qu.offer(new int[]{newRow,newCol});
                                grid[newRow][newCol]='0';
                            }
                        }
                    }

                }
            }
        }

return res;
    }

}
