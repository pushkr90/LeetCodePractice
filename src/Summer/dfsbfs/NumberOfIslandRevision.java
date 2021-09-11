package Summer.dfsbfs;

public class NumberOfIslandRevision {
    private  int res=0;
    public int numIslands(char[][] grid) {


        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j< grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(i,j,grid);
                }
            }
        }
        return res;

    }
    private void dfs(int row,int col,char[][] grid)
    {
        if(row<0||col>grid[0].length||row>grid.length||grid[row][col]=='0'||col<0)
        {
            return;
        }
        grid[row][col]='0';
        dfs(row+1,col,grid);
        dfs(row-1,col,grid);
        dfs(row,col+1,grid);
        dfs(row,col-1,grid);
        grid[row][col]='1';

    }
}
