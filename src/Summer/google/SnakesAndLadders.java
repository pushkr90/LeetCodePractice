package Summer.google;

import java.util.LinkedList;
import java.util.Queue;

public class SnakesAndLadders {
    public int snakesAndLadders(int[][] board)
    {
        int row=board.length;
        int col=board[0].length;
        int[] arr=new int[row*col+1];
        int k=1;
        boolean zigzag=true;
        for(int i=row-1;i>=0;i--)
        {
            if(zigzag)
            {
                for(int j=0;j<col;j++)
                {
                    arr[k++]=board[i][j];
                }
            }
            else {
                for(int j=col-1;j>=0;j--) {
                    arr[k++] = board[i][j];
                }
            }
            zigzag=!zigzag;
        }
        Queue<helper> qu=new LinkedList<>();
        boolean []visited=new boolean[row*col+1];
        helper inside=new helper(1,0);
        qu.offer(inside);
        visited[1] = true;
        while(!qu.isEmpty())
        {
             inside=qu.poll();

            if(inside.position==row*col) break;

            int position= inside.position;

                for(int i=position+1;i<=position+6 &&i<=row*col;i++)
                {
                    if (!visited[i])
                    {
                        visited[i]=true;
                        if(arr[i]!=-1)
                        {

                            qu.offer(new helper(arr[i],inside.count+1));
                        }
                        else{

                            qu.offer(new helper(i,inside.count+1));
                        }
                    }

                }

        }
        return inside.count;


    }

    class helper{
        int position;
        int count;
        public helper(int position,int count)
        {
            position=this.position;
            count=this.count;
        }
    }
}
