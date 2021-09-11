package Summer.google;

public class TransposeMatrix
{
    public int[][] transpose(int[][] matrix)
    {
        int[][]res=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                res[i][j]=matrix[j][i];
            }
        }
    return res;
    }
}
