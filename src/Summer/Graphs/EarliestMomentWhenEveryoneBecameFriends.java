package Summer.Graphs;

import java.util.Arrays;

public class EarliestMomentWhenEveryoneBecameFriends
{

    class pair{
        int size;
        int count;
        int[] rank;
        int[] root;
        public pair(int size)
        {
            rank=new int[size];
            root=new int[size];
            this.size=size;
            this.count=size;

            for(int i=0;i<size;i++)
            {
                rank[i]=1;
                root[i]=i;
            }
        }


        private int find(int x)
        {
            if(x==root[x])
            {
                return x;
            }

            root[x]=find(root[x]);
            return root[x];
        }

        private void union(int x,int y)
        {
            int valX=find(x);
            int valY=find(y);
            if(valX!=valY)
            {
                if(rank[valX]==rank[valY])
                {
                    rank[valX]++;
                    root[valY]=valX;
                }
                else if(rank[valX]>rank[valY])
                {
                    root[valY]=valX;
                }
                else{
                    root[valX]=valY;
                }
                count--;
            }
        }
    }
    public int earliestAcq(int[][] logs, int n)
    {
        pair p=new pair(n);
        Arrays.sort(logs,(a,b)->(a[0]-b[0]));

        for(int[] each:logs)
        {
            p.union(each[1],each[2]);
            if(p.count==1)
            {
                return each[0];
            }
        }
        return -1;

    }
}
