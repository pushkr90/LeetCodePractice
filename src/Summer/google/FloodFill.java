package Summer.google;

public class FloodFill {
    boolean [][]visited;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
       visited=new boolean[image.length][image[0].length];
       int temp=image[sr][sc];
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                if(image[i][j]==image[sr][sc])
                {
                    fill(image,sr,sc,newColor,i,j,temp);
                }
            }
        }
        return image;
    }
    private void fill(int[][]image,int sr,int sc,int newColor,int i,int j,int temp)
    {
        if(i<0||j<0||i>=image.length||j>=image[0].length||image[i][j]!=temp||visited[i][j]==true)
        {
            return;
        }
        image[i][j]=newColor;
        visited[i][j]=true;

        fill(image,sr,sc,newColor,i+1,j,temp);
        fill(image,sr,sc,newColor,i-1,j,temp);
        fill(image,sr,sc,newColor,i,j+1,temp);
        fill(image,sr,sc,newColor,i,j-1,temp);

    }
}
