package Summer.Graphs;

public class FindPathExistsUsingUnionFind
{
     class pair
     {
         int size;
         int[] root;
         int[] rank;
         public pair(int size)
         {
             this.size=size;
             root=new int[size];
             rank=new int[size];

             for(int i=0;i<size;i++)
             {
                 root[i]=i;
                 rank[i]=1;
             }
         }

         private int find(int val)
         {
             if(val==root[val])
             {
                 return val;
             }

             root[val]=find(root[val]);
             return root[val];
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
             }
         }

     }
    public boolean validPath(int n, int[][] edges, int start, int end)
    {

        pair p=new pair(n);
        for(int [] each:edges)
        {
            p.union(each[0],each[1]);
        }

        return p.find(start)==p.find(end);

    }
}
