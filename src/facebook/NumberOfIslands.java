package facebook;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int res=0;
        if(grid.length==0)
        {
            return res;
        }

        for(int i=0;i<grid.length;i++)

        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    if(dfs(i,j,grid))
                    {
                        res++;
                    }
                }
            }
        }
        return res;

    }
    private boolean dfs(int i,int j,char[][]grid)
    {
        if(i>=0 && i< grid.length && j>=0 && j<grid[0].length && grid[i][j]=='1')
        {
            grid[i][j]='0';
            dfs(i+1,j,grid);
            dfs(i-1,j,grid);
            dfs(i,j+1,grid);
            dfs(i,j-1,grid);
            return true;
        }
        return false;
    }
}
