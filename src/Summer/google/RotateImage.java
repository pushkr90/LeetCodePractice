package Summer.google;

public class RotateImage {
    public void rotate(int[][] matrix)
    {
        int low=0;
        int high=matrix.length-1;
        while(low<high)
        {
            int len=high-low;
            for(int i=0;i<len;i++)
            {
                int index=i+low;
                swap(matrix,low,index,low+i,high);
                swap(matrix,low,index,high,high-i);
                swap(matrix,low,index,high-i,low);

            }
            low++;
            high--;
        }
    }
    private void swap(int[][] matrix,int i,int j,int k,int l)
    {
        int temp=matrix[i][j];
        matrix[i][j]=matrix[k][l];
        matrix[k][l]=temp;

    }
}
