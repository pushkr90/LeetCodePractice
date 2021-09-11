package Summer.dfsbfs;

public class MaxAreaOfIsland {
    private int res=0;
    public int maxAreaOfIsland(int[][] grid) {
    boolean[][] visited=new boolean[grid.length][grid[0].length];
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    int res=(dfs(i,j,grid,visited)) ;
                        max = Math.max(res, max);

                }
            }
        }
        return max;
    }

    private int dfs(int row, int col, int[][] grid, boolean[][] visited)
    {
        int count=0;
        if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && visited[row][col]!=true && grid[row][col]==1)
        {
            visited[row][col]=true;
            count=1;
            grid[row][col]=0;
            count+=dfs(row+1,col,grid,visited);
            count+=dfs(row-1,col,grid,visited);
            count+=dfs(row,col+1,grid,visited);
            count+=dfs(row,col-1,grid,visited);
            return count;
        }
        return 0;

    }
}
