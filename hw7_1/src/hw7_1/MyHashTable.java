package hw7_1;

public class MyHashTable {
	private class Node {
		//Node형 클래스 
		int key;
		Node link;
	}
	private Node[] table;//테이블 Node형
	private int m;//테이블의 크기
	private int n;//원소 수
	private static final double A=0.6180339887;//곱하기 방법으로 연산할 상수 A

	public MyHashTable(int m) {
		//생성자
		table=new Node[m];//노드형 table로 초기화
		this.m=m;//매개변수로 초기화
		this.n=0;//0으로 초기화
		// TODO Auto-generated constructor stub
	}
	private int hash(int key) {
		//해시 함수 메소드
		return (int) (key*A%1*m);//값 리턴
	}
	public void add(int key) {
		//해시 테이블에 원소를 추가해주는 메소드
	
		int i=hash(key);//해시 함수 결과값을 i에 삽입
		Node node=new Node();//새로운 Node 생성
		node.link=table[i];//Node.link가 table[i]를 가리킨다
		table[i]=node;//table[i]는 Node
		table[i].key=key;//table.key에 key값 삽입
		n++;//원소 수 증가



	}
	public double getLoadFactor() {
		//적재율 계산하는 메소드
		return n/(double)m;
	}
	public boolean contains(int key) {
		//원소의 유무를 검증하는 메소드
		int i=hash(key);//해쉬값 저장할 변수 i
		Node temp=table[i];//key값이 맞는지를 검사할 Node형 변수 temp
		while(temp!=null) {
			//반복문(temp가 null이 아닌 이상)
			if(temp==null)//temp가 null이면
				return false;
			else if(temp.key==key)
				//temp.key의 값이 searchArray의 검색 key와 일치하면
				return true;
			else //키 값이 다르면
				temp=temp.link;
		}
		return false;
		
	}
	public void printTable() {
		//결과값 출력하는 메소드
		for(int i=0; i<table.length; i++) {
			//반복문
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
