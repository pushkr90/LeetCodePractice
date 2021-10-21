package Summer.Graphs;

public class GraphValidTree {

    class pair
    {
        int size;
        int[] root;
        int [] rank;
        public pair(int size)
        {
            root=new int[size];
            rank=new int[size];
            this.size=size;
            for(int i=0;i<size;i++)
            {
                root[i]=i;
                rank[i]=1;
            }
        }

        public int find(int val)
        {
            if(val==root[val])
            {
                return val;
            }

            root[val]=find(root[val]);
            return root[val];
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
                    root[valY]=valX;
                }
                else {
                    root[valX]=valY;
                }
            }
            return true;
        }


    }
    public boolean validTree(int n, int[][] edges) {
        pair p=new pair(n);
        for(int [] each:edges)
        {
            if(!p.union(each[0],each[1]))
            {
                return false;
            }
        }
        return true;

    }
}
