package Summer.tesla;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> res=new ArrayList<>();

        int rowEnd=matrix.length-1;
        int roStart=0;
        int colStart=0;
        int colEnd=matrix[0].length;

        while(roStart<=rowEnd && colStart<=colEnd)
        {
            for(int i=colStart;i<colEnd;i++)
            {
                res.add(matrix[roStart][i]);
            }
            roStart++;

            for(int i=roStart;i<rowEnd;i++)
            {
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(colStart>colEnd)
            {
                for (int i = colEnd; i >= colStart; i--)
                {
                    res.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            if(roStart>rowEnd)
            {
                for (int i = rowEnd; i >= roStart; i--)
                {
                    res.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }
        return res;

    }
}

/*
[[1,2,3],
[4,5,6],
[7,8,9]]

1,2,3,6,9,8,7,4,5]


    [1,2,3,2,3,4,4,5] k=4
    [1,2][1,3]
* */
