package Summer.ArrayAndHashMap;

import java.util.ArrayList;
import java.util.List;

public class spiralmatrix {
    public List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> list=new ArrayList<>();
        int rowStart=0;
        int rowEnd=matrix.length-1;
        int colStart=0;
        int colEnd=matrix[0].length-1;


        while(rowStart<=rowEnd && colStart<=colEnd)
        {
            for(int i=colStart;i<=colEnd;i++)
            {
                list.add(matrix[rowStart][i]);
            }
            rowStart++;

            for(int i=rowStart;i<=rowEnd;i++)
            {
                list.add(matrix[colEnd][i]);
            }
            colEnd--;
            if(rowStart<=rowEnd){
            for(int i=colEnd;i>=0;i--)
            {
                list.add(matrix[rowEnd][i]);
            }}
            rowEnd--;
            if(colEnd>=colStart)
            {
            for(int i=rowEnd;i>=rowStart;i--)
            {
                list.add(matrix[i][colStart]);
            }
            colStart++;
            }

        }
        return list;

    }
}
