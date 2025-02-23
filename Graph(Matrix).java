package Mid;

public class Graph {
	 public static void main(String[] args) {
		 int[][] adj = {
		            {0, 1, 1, 0, 0, 0, 0, 0},
		            {0, 0, 0, 0, 0, 0, 0, 1},
		            {1, 0, 0, 0, 0, 0, 0, 0},
		            {0, 0, 1, 0, 1, 0, 0, 0},
		            {0, 0, 1, 0, 0, 0, 0, 0},
		            {0, 0, 0, 1, 1, 0, 1, 0},
		            {0, 0, 1, 0, 0, 0, 0, 0},
		            {1, 0, 1, 1, 0, 0, 0, 0}
		        };
		 DFS d=new DFS();
		 d.dfs(adj);
	 }
}
