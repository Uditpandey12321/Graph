package GRAPH;
public class graph {
    public static void addEdge(int [][] mat, int i, int j){
        mat[i][j] = 1;
       // mat[j][i] = 1;
    }
    public static void displayMatrix(int [][] mat){
        for(int i=0;i<mat.length;i++){
            System.out.print("row"+i+" ->");
            for(int j =0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int [] bfs(int [][] adj , int s, int v){
        int res[] = new int[v];
        int ind =0;
        int [] que = new int[v];
        int front =0 , rear = 0;
        boolean [] visited = new boolean[v];
        visited[s] = true;
        que[rear++] = s;
        while (front<rear) {
            int cur = que[front++];
            res[ind++] = cur;
            for(int i=0;i<v;i++){
                if (adj[cur][i]== 1 && !visited[i]) {
                    visited[i] = true;
                    que[rear++] = i;
                }
            }
        }
        return res;
    } 
    // Traversal of the graph using dfs
    static void dfsrec(int [][] adj, boolean[] visit, int s, int V){
        visit[s]=true;
        System.out.print(s+" ");
        for(int i=0;i<V;i++){
            if (adj[s][i]==1 && !visit[i]) {
                dfsrec(adj, visit, i, V);
            }
        }
    }
    public static void main(String[] args) {
        int v = 4;
        int [][] mat = new int[v][v];
        addEdge(mat, 0, 1);
        addEdge(mat, 0, 2);
        addEdge(mat, 1, 2);
        addEdge(mat, 2, 3);
        System.out.println("Matrix ");
        displayMatrix(mat);
        System.out.println("BFS traversal ");
        int src =0;
        int ans[] = bfs(mat, src, v);
        // for(int i=0;i<v;i++){
        //     if (ans[i]!=0 || i == src) {
        //         System.out.print(ans[i]+" ");
        //     }
        // }
        System.out.println("DFS traversal ");
        boolean [] visit = new boolean[v];
        dfsrec(mat, visit, src, v);
    }
}
