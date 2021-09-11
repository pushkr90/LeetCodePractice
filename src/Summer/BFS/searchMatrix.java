package Summer.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class searchMatrix
{
    public void setZeroes(int[][] matrix) {
    boolean[] row=new boolean[matrix.length];
    boolean[]col=new boolean[matrix[0].length];

    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==0)
            {
                row[i]=true;
                col[j]=true;
            }
        }
    }
    for(int i=0;i<row.length;i++)
    {
        if(row[i]=true)
        {
                for(int c=0;c<matrix[0].length;c++)
                {
                    matrix[i][c]=0;
                }
            }
    }
    for(int j=0;j<col.length;j++)
    {
        if(col[j]=true)
        {
            for(int r=0;r<matrix.length;r++)
            {
                matrix[r][j]=0;
            }
        }
    }

    }

}
