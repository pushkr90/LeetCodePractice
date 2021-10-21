package Summer.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInABinaryMatrix {
    private static final int[][] directions =
            new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    public int shortestPathBinaryMatrix(int[][] grid)
    {
        if(grid[0][0]==1 ||grid[grid.length-1][grid[0].length-1]==1){
            return -1;
        }

        Queue<int[]> qu=new LinkedList<>();
        int res=0;
        qu.offer(new int[]{0,0});
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        visited[0][0]=true;
        while(!qu.isEmpty())
        {
            int size=qu.size();
            res++;

            for(int i=0;i<size;i++)
            {
                int[] curr=qu.poll();
                if(curr[0]==grid.length-1 && curr[1]==grid[0].length-1 ) return res;

                for(int [] each:directions)
                {
                    int newX=each[0]+curr[0];
                    int newY=each[1]+curr[1];
                    if(newX>=0 && newX<grid.length && newY>=0 && newY<grid[0].length&&!visited[newX][newY] && grid[newX][newY]==0)
                    {
                        visited[newX][newY]=true;
                        qu.offer(new int[]{newX,newY});
                    }
                }
            }

        }
        return -1;

    }
}
