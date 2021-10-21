package Summer.Graphs;

public class NumberOfProvincesUsingUnionFind
{

    public class test
    {
        int[] root;
        int[] rank;
        int count;

        public test(int size) {
            count = size;
            root = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                root[i] = i;
                rank[i] = 1;
            }
        }

        public int find(int val) {
            if (val == root[val]) {
                return val;
            }
            root[val] = find(root[val]);
            return root[val];
        }

        public void union(int x, int y) {
            int valX = find(x);
            int valY = find(y);
            if (valX == valY) return;
            else {
                if (rank[valX] == rank[valY]) {
                    rank[valX] += rank[valY];
                    root[valY] = root[valX];
                } else if (rank[valX] > rank[valY]) {
                    root[valY] = root[valX];
                } else {
                    root[valX] = root[valY];
                }
            }
            count--;
        }
    }

    public int findCircleNum(int[][] isCoonected)
    {
        int size = isCoonected.length;
        test n = new test(size);
        for (int i = 0; i < isCoonected.length; i++) {
            for (int j = i + 1; j < isCoonected[i].length; j++) {
                if (isCoonected[i][j] != 0) {
                    n.union(i, j);
                }
            }
        }
        return n.count;
    }

}


