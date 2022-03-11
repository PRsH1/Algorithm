package lab1_1;
import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("lab1_1: 이승현");
		Scanner input=new Scanner(System.in);
		System.out.print("\n정수값 입력: ");//매개변수 n의 정수값 입력
		int n = input.nextInt();
		//반복함수 iterativePrint(n) 호출
		System.out.print("반복 출력 = ");
		iterativePrint(n);
		//재귀함수 recursivePrint(n) 호출
		System.out.print("\n재귀 출력 = ");
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
