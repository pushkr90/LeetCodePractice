package Summer.google;

import java.util.Arrays;

public class minPathSum
{
    public int minPathSum(int[][] grid)
    {
        int[][] cache=new int[grid.length][grid[0].length];

        //  Arrays.fill(cache,-1);
        return dfs(0,0,grid,cache);
    }
    private int dfs(int row,int col, int[][]grid,int[][]cache)
    {
        if(row>=grid.length ||col>=grid[0].length ||row<0||col<0) return Integer.MAX_VALUE;
        if(row==grid.length-1 && col ==grid[0].length-1 ) return  grid[row][col];
        if(cache[row][col]!=0)
        {
            return cache[row][col];
        }
        cache[row][col]=grid[row][col]+Math.min(dfs(row+1,col,grid,cache),dfs(row,col+1,grid,cache));
        return cache[row][col];
    }
}
