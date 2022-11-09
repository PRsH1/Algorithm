package lab10_1;

import java.util.LinkedList;
import java.util.Collections;

public class MyGraph {
	private LinkedList<Integer> vertex[];
	//연결리스트형 변수 vertex선언
	
	MyGraph(int n) {
		//생성자
		vertex=new LinkedList[n+1];//연결리스트의 크기 n+1
		for(int i=0; i<n+1; i++) {
			//반복문
			vertex[i]=new LinkedList<Integer>();
		}
	}
	public void insertEdge(int v1, int v2) {
		//간선 추가하는 메소드
		vertex[v1].add(v2);
		vertex[v2].add(v1);
	}
	public void printVertex(int v) {
		//결과를 출력하는 메소드
		Collections.sort(vertex[v]);
		System.out.print(v+ "에 인접한 정점 = ");
		for(int i=0; i<vertex[v].size(); i++) {
			System.out.print(vertex[v].get(i)+ " ");
		}
		System.out.println();
	}

}
