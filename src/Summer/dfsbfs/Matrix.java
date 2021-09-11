package Summer.dfsbfs;

import java.util.*;

public class Matrix {

    public int[][] updateMatrix(int[][] mat) {
        int[][] res=new int[mat.length][mat[0].length];
        Queue<int[]> qu=new LinkedList<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==0)
                {
                    qu.offer(new int[]{i,j});
                }
                else{
                    mat[i][j]=-1;
                }
            }
        }
        int[][] dirs=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while(!qu.isEmpty())
        {
            int[] curr=qu.poll();
            for(int []each:dirs)
            {
                int row=each[0]+curr[0];
                int col=each[1]+curr[1];
                if(row>=0 &&row<mat.length && col>=0 && col<mat[0].length && mat[row][col]==-1)
                {
                    mat[row][col]=mat[curr[0]][curr[1]]+1;
                    qu.offer(new int[]{row,col});
                }
            }

        }

        return  mat;
    }
}
