package Summer.Graphs;

public class Main {
    public static void main(String[] args)
    {
        int[][] each=new int[][]{
        // Notice that node 0 is unconnected
        {1, 2}, {1, 7}, {1, 8}, {2, 3}, {2, 6}, {3, 4},
        {3, 5}, {8, 9}, {8, 12}, {9, 10}, {9, 11}};

        int[][] each1=new int[][]{
                // Notice that node 0 is unconnected
                {1, 2}, {1, 7}, {1, 8}, {2, 3}, {2, 6}, {3, 4},
                {3, 5}, {8, 9}, {8, 12}, {9, 10}, {9, 11},{10,11}};

        GraphDFSDirected g1=new GraphDFSDirected();
        System.out.println(g1.directedGraph(each));
        GraphDFSUndirected g2=new GraphDFSUndirected();
        System.out.println(g2.undirectedTraversal(each));


        GraphBFSDirected g3=new GraphBFSDirected();
        System.out.println(g3.BFSDirected(each));

        GraphDFSCycleDetection G4=new GraphDFSCycleDetection();
        System.out.println(G4.cycleDFS(each1));


    }
}
