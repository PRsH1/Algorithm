package hw1_1;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw1_1 : 이승현");
		int []array= {-10, -20, 30, 40, 50, 60, 70, 80, 90, 100, 10, 20};
		Scanner scan=new Scanner(System.in);
		System.out.print("하한 입력(0~11) : ");
		int lb=scan.nextInt();
		System.out.print("상한 입력(0~11) : ");
		int ub=scan.nextInt();
		if(lb<0) {
			System.out.print("입력값 오류입니다!");
		}
		else if(lb>11) {
			System.out.print("입력값 오류입니다!");
		}
		else if(ub>11){
			System.out.print("입력값 오류입니다!");
		}
		else if(ub<0) {
			System.out.print("입력값 오류입니다!");
		}
		else {
			System.out.print("출력 = ");
			iterativeArrayPrint(array,lb,ub);
			System.out.print("\n합 = ");
			System.out.print(recursiveArraySum(array,lb,ub));

		}




	}
	private static void iterativeArrayPrint(int []array,int lb,int ub) {
		for(int a=lb; a<=ub; a++ ) {
			System.out.print(array[lb++]+ " ");
		}

	}
	private static int recursiveArraySum(int []array,int lb,int ub) {


		if(lb<=ub-1) {

			recursiveArraySum(array,lb+1,ub);
			array[lb]=array[lb]+array[lb+1];


		}
		else if(lb==ub)
			return array[lb];
		else
			return 0;
		return array[lb];

	}

}
