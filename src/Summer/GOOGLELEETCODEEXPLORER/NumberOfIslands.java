package Summer.GOOGLELEETCODEEXPLORER;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int res=0;

        if(grid.length==0) return res;
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

    private boolean dfs(int start, int end,char[][]grid)
    {
        if(start>=0 && start<grid.length && end>=0 && end<grid[0].length && grid[start][end]=='1'&&grid[start][end]!='#')
        {
            grid[start][end]='#';
            dfs(start+1,end,grid);
            dfs(start-1,end,grid);
            dfs(start,end+1,grid);
            dfs(start,end-1,grid);

            return true;


        }
        return false;
    }
}
