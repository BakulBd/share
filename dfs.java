package Mid;

public class DFS {
    int[] color=new int[8], prev=new int[8], d=new int[8], f=new int[8];
    int time=0;

    void dfs(int[][] adj) {
        int n=adj.length;
        for (int i=0; i < n; i++) {
            color[i]=0;
            prev[i]=-1;
            d[i]=f[i]=0;
        }
        time=0;
        for (int i=0; i < n; i++) {
            if (color[i]==0) {
                dfs_visit(i, adj);
            }
        }
    }

    void dfs_visit(int u, int[][] adj) {
        color[u]=1;
        d[u]=++time;
        for (int v=0; v < adj.length; v++) {
            if (adj[u][v]==1) {
                if (color[v]==0) {
                    System.out.println(u + " " + v + " Tree Edge Detected");
                    prev[v]=u;
                    dfs_visit(v, adj);
                } else if (color[v]==1) {
                    System.out.println("Back Edge and Cycle Detected");
                } else if (d[u] < d[v]) {
                    System.out.println("Forward Edge");
                } else {
                    System.out.println("Cross Edge");
                }
            }
        }
        color[u]=2;
        f[u]=++time;
    }
}
