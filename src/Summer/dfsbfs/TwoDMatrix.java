package Summer.dfsbfs;

public class TwoDMatrix {
    boolean found;
    public boolean searchMatrix(int[][] matrix, int target)
    {
        found=false;
        boolean[][]visited=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i< matrix.length;i++)

        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(dfs(i,j,target,matrix,visited))
                {
                    found=true;
                    break;
                }
            }
        }
    return found;
    }
    private boolean dfs(int i,int j,int target,int[][] matrix,boolean[][]visited)
    {
        if(i<0||i>matrix.length||j<0||j>matrix[0].length||visited[i][j])
        {
            return false;
        }
        if(matrix[i][j]==target) return true;
        visited[i][j]=true;
        dfs(i+1,j,target,matrix,visited);
        dfs(i-1,j,target,matrix,visited);
        dfs(i,j-1,target,matrix,visited);
        dfs(i,j+1,target,matrix,visited);

        return false;


    }
}
