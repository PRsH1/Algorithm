package lab10_1;

import java.util.LinkedList;
import java.util.Collections;

public class MyGraph {
	private LinkedList<Integer> vertex[];
	//���Ḯ��Ʈ�� ���� vertex����
	
	MyGraph(int n) {
		//������
		vertex=new LinkedList[n+1];//���Ḯ��Ʈ�� ũ�� n+1
		for(int i=0; i<n+1; i++) {
			//�ݺ���
			vertex[i]=new LinkedList<Integer>();
		}
	}
	public void insertEdge(int v1, int v2) {
		//���� �߰��ϴ� �޼ҵ�
		vertex[v1].add(v2);
		vertex[v2].add(v1);
	}
	public void printVertex(int v) {
		//����� ����ϴ� �޼ҵ�
		Collections.sort(vertex[v]);
		System.out.print(v+ "�� ������ ���� = ");
		for(int i=0; i<vertex[v].size(); i++) {
			System.out.print(vertex[v].get(i)+ " ");
		}
		System.out.println();
	}

}
