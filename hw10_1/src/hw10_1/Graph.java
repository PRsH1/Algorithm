package hw10_1;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	static boolean[] visited;//방문 여부를 확인하는 private변수
	static int[][] matrix;
	static int n;//정점 수	
	public Graph(int n) {
		this.n=n;
		matrix=new int[n][n];
		visited=new boolean[n];
	}
	public void add(int v1,int v2) {
	
		matrix[v1][v2]=1;
		matrix[v2][v1]=1;
	}
	public static void bfs(int v) {
		visited=new boolean[10001];
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(v);
		visited[v] = true;
		int check;
		System.out.print(v + " ");
		while(!Q.isEmpty()) {
			check = Q.peek();
			Q.poll();
			for(int j=1; j<n; j++) {
				if(matrix[check][j] == 1 && visited[j]==false) {
					Q.add(j);
					visited[j] = true;
					System.out.print(j+" ");
				}
			}
		}
	}


	public void dfs(int v) {
		visited[v]=true;
		System.out.print(v+" ");
		for(int i=1; i<n; i++) {
			if(matrix[v][i]==1 && visited[i]==false) {
				dfs(i);
			}
		}	
		}


}
