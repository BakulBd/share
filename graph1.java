package Mid;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Graph1 {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("/home/student_user/IdeaProjects/Bakul/src/Mid/input.txt");

        Scanner sc= null;
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int n=sc.nextInt();
        int e=sc.nextInt();
        sc.nextLine();
         int gr[][]=new int[n][n];
        for(int i=0;i<e;i++){
            String x=sc.nextLine();
            char p=x.charAt(0);
            char q=x.charAt(2);
            int u=p-65;
            int v=q-65;
            gr[u][v]=1;
            //gr[v][u]=1;
        }

        BFS d=new BFS(n);
        d.bfs(gr);
    }
}
