package Summer.google;

public class MinimumPathSum
{
    public int minPathSum(int[][] grid)
    {
        int[][]dp=new int[grid.length][grid[0].length];
       return helper(grid,dp,0,0);
    }
    private int helper(int[][]grid,int[][]dp,int i,int j)
    {
        if(i<0||i>=grid.length||j<0||j>=grid[0].length)
        {
            return Integer.MAX_VALUE;
        } if(i== grid.length-1 && j==grid[0].length)
    {
        return grid[i][j];
    }
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }

        dp[i][j]=grid[i][j]+Math.min(helper(grid,dp,i+1,j),helper(grid,dp,i,j+1));
        return dp[i][j];

    }
}
