package lab1_1;
import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("lab1_1: �̽���");
		Scanner input=new Scanner(System.in);
		System.out.print("\n������ �Է�: ");//�Ű����� n�� ������ �Է�
		int n = input.nextInt();
		//�ݺ��Լ� iterativePrint(n) ȣ��
		System.out.print("�ݺ� ��� = ");
		iterativePrint(n);
		//����Լ� recursivePrint(n) ȣ��
		System.out.print("\n��� ��� = ");
		recursivePrint(n);
		input.close();




	}
	private static void iterativePrint(int n) {
		
		for(int a=1; a<=n; a++) {
			System.out.print(a+" ");
		}

	}
	private static void recursivePrint(int n) {

	
		if (n>0) {
			
			recursivePrint(n-1);
			System.out.print(n+" ");



		}
		else 
			System.out.print("");


	}

}
