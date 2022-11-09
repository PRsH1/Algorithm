package hw10_1;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;//정점의 개수
		int m;//간선의 개수
		int v;//탐색 시작할 번호
	
	
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		v=scan.nextInt();
		Graph g=new Graph(n+1);
		for(int i=1; i<=m; i++) {
			int v1=scan.nextInt();
			int v2=scan.nextInt();
			g.add(v1, v2);
		}
		g.dfs(v);
		System.out.println();
		g.bfs(v);
	}

}
