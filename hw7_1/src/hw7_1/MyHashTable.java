package hw7_1;

public class MyHashTable {
	private class Node {
		//Node�� Ŭ���� 
		int key;
		Node link;
	}
	private Node[] table;//���̺� Node��
	private int m;//���̺��� ũ��
	private int n;//���� ��
	private static final double A=0.6180339887;//���ϱ� ������� ������ ��� A

	public MyHashTable(int m) {
		//������
		table=new Node[m];//����� table�� �ʱ�ȭ
		this.m=m;//�Ű������� �ʱ�ȭ
		this.n=0;//0���� �ʱ�ȭ
		// TODO Auto-generated constructor stub
	}
	private int hash(int key) {
		//�ؽ� �Լ� �޼ҵ�
		return (int) (key*A%1*m);//�� ����
	}
	public void add(int key) {
		//�ؽ� ���̺��� ���Ҹ� �߰����ִ� �޼ҵ�
	
		int i=hash(key);//�ؽ� �Լ� ������� i�� ����
		Node node=new Node();//���ο� Node ����
		node.link=table[i];//Node.link�� table[i]�� ����Ų��
		table[i]=node;//table[i]�� Node
		table[i].key=key;//table.key�� key�� ����
		n++;//���� �� ����



	}
	public double getLoadFactor() {
		//������ ����ϴ� �޼ҵ�
		return n/(double)m;
	}
	public boolean contains(int key) {
		//������ ������ �����ϴ� �޼ҵ�
		int i=hash(key);//�ؽ��� ������ ���� i
		Node temp=table[i];//key���� �´����� �˻��� Node�� ���� temp
		while(temp!=null) {
			//�ݺ���(temp�� null�� �ƴ� �̻�)
			if(temp==null)//temp�� null�̸�
				return false;
			else if(temp.key==key)
				//temp.key�� ���� searchArray�� �˻� key�� ��ġ�ϸ�
				return true;
			else //Ű ���� �ٸ���
				temp=temp.link;
		}
		return false;
		
	}
	public void printTable() {
		//����� ����ϴ� �޼ҵ�
		for(int i=0; i<table.length; i++) {
			//�ݺ���
			System.out.print("table[" + i+ "] = ");
			Node temp=table[i];
			while(temp!=null) {
				System.out.print(temp.key+" ");
				temp=temp.link;
			}
			System.out.println();
		}

	}

}