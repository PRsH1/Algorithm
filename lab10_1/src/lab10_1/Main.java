package lab10_1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab10_1 : �̽���");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();//������ �Է�
		MyGraph graph=new MyGraph(n);//������ n�� ������ �׷��� ����
		int e=input.nextInt();//���� �Է�
		for (int i=0; i<e; i++) {
			//�ݺ���
			int from=input.nextInt();
			int to=input.nextInt();
			graph.insertEdge(from, to);
		}
		for (int i=1; i<n+1; i++) {
			//�ݺ���
			graph.printVertex(i);
		}

	}

}
