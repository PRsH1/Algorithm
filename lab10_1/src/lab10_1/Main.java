package lab10_1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab10_1 : 이승현");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();//정점수 입력
		MyGraph graph=new MyGraph(n);//정점수 n인 무방향 그래프 생성
		int e=input.nextInt();//간선 입력
		for (int i=0; i<e; i++) {
			//반복문
			int from=input.nextInt();
			int to=input.nextInt();
			graph.insertEdge(from, to);
		}
		for (int i=1; i<n+1; i++) {
			//반복문
			graph.printVertex(i);
		}

	}

}
