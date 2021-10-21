package Summer.Graphs;

import java.util.PriorityQueue;

public class MinCostToConnectAllPoints
{
    class pair
    {
        int point1;
        int point2;
        int cost;
        public pair(int point1,int point2,int cost)
        {
            this.point2=point2;
            this.point1=point1;
            this.cost=cost;
        }
    }
    public int minCostConnectPoints(int[][] points)
    {
        PriorityQueue<pair>pq=new PriorityQueue<pair>((a,b)->(a.cost-b.cost));

        for(int i=0;i<points.length;i++)
        {
            for(int j=i+1;j<points.length;j++)
            {
                int cost=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
                pair p=new pair(i,j,cost);
                pq.add(p);
            }
        }
        int noOfEdges=points.length-1;
        unionFind u=new unionFind(noOfEdges+1);
        int res=0;
        while(!pq.isEmpty() && noOfEdges>0)
        {
            pair p=pq.poll();
           if( u.union(p.point1,p.point2))
           {
               noOfEdges--;
               res+=p.cost;
           }

        }
        return res;


    }

    class unionFind
    {
        int size;
        int[] rank;
        int[] root;
        public unionFind(int size)
        {
            this.size=size;
            rank=new int[size];
            root=new int[size];
            for(int i=0;i<size;i++)
            {
                rank[i]=1;
                root[i]=i;
            }
        }

        public int find(int x)

        {
            if(x==root[x])
            {
                return x;
            }
            root[x]=find(root[x]);
            return root[x];
        }

        public boolean union(int x,int y)
        {
            int valX=find(x);
            int valY=find(y);

            if(valX==valY) return false;
            else{
                if(rank[valX]==rank[valY])
                {
                    rank[valX]++;
                    root[valY]=valX;

                }
                else if(rank[valX]>rank[valY])
                {
                    rank[valY]=valX;
                }
                else{
                    rank[valX]=valY;
                }
            }
            return true;
        }
    }
}
