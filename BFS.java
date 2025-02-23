package Mid;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    int n;
    int color[];
    int d[];
    int prev[];
    BFS(int n){
        color=new int[n];
        d=new int[n];
        prev=new int[n];
        this.n=n;
    }

    public void bfs(int gr[][]){
        for(int i=0;i<n;i++){
            color[i]=0;
            d[i]=Integer.MAX_VALUE;;
            prev[i]=-1;
        }
        int s=0;
        color[s]=1;
        d[s]=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int u=q.poll();
            for(int v=0;v<n;v++){
                if(gr[u][v]==1 && color[v]==0){
                    color[v]=1;
                    d[v]=d[u]+1;
                    prev[v]=u;
                    q.add(v);
                }
            }
            color[u]=2;
        }
        for(int i=0;i<n;i++){
            char c= (char) (i+65);
            char pr= (char) (prev[i]+65);
            System.out.println("Node= "+c+" Level= "+d[i]+" Parent "+pr);
        }



    }


}
