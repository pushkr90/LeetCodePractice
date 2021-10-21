package Summer.Graphs;

public class UnionAndFind {
    int[] rank;
    int[] root;

    public UnionAndFind(int size)
    {
        rank=new int[size];
        root=new int[size];

        for(int i=0;i<size;i++)
        {
            root[i]=i;
            rank[i]=1;
        }
    }

    public int find(int val)
    {
        while(val!=root[val])
        {
            val=root[val];
        }
        return val;
    }

    public void union(int x,int y)
    {
        int xVal=find(x);
        int yVal=find(y);
        if(xVal!=yVal)
        {
            if(rank[xVal]==rank[yVal])
            {
                rank[xVal]=1+rank[yVal];
                root[yVal]=xVal;
            }
            else if(rank[xVal]>rank[yVal])
            {
                root[yVal]=xVal;
            }
            else{
                root[xVal]=yVal;
            }
        }
    }

    public boolean connected(int x,int y)
    {
        return find(x)==find(y);
    }

    public static void main(String[] args)
    {
        UnionAndFind uf=new UnionAndFind(10);
        uf.union(1, 2);
        uf.union(2, 5);
        uf.union(5, 6);
        uf.union(6, 7);
        uf.union(3, 8);
        uf.union(8, 9);
        System.out.println(uf.connected(1, 5)); // true
        System.out.println(uf.connected(5, 7)); // true
        System.out.println(uf.connected(4, 9)); // false
        // 1-2-5-6-7 3-8-9-4
        uf.union(9, 4);
        System.out.println(uf.connected(4, 9)); // true

    }


}
