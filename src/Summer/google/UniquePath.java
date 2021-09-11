package Summer.google;

public class UniquePath {
    int sum=0;
    int[][] cache;
    public int uniquePaths(int m, int n) {
         cache=new int[m][n];
        helper(0,0,m,n);
        return sum;
    }

    private int helper(int start,int end, int totalRow,int totalCol)
    {
        if(start>=totalRow||end>=totalCol||start<0 ||end<0)
        {return 0 ;}
        if(cache[start][end]!=0)
        {
            return cache[start][end];
        }
        else if(start==totalRow && end==totalCol)
        {

            return 1;
        }
        int left= helper(start+1,end,totalRow,totalCol);
        int down= helper(start,end+1,totalRow,totalCol);
        cache[start][end]=left+down;
        return cache[start][end];

    }
}
