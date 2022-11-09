package hw8_1;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String a;
		String b;
		a=input.nextLine();
		b=input.nextLine();
		int[][] arr=new int[a.length()][b.length()];
		System.out.print(Lcs(a.length(),b.length(),a,b));
		
		

	}
	public static int Lcs(int m,int n,String a,String b) {
		int [][]c=new int[m+1][n+1];
		String []str1=a.split("");
		String []str2=b.split("");
		for(int i=0; i<m+1; i++) {
			c[i][0]=0;
			
		}
		for (int j=0; j<n+1; j++) {
			c[0][j]=0;
		}
		for (int i=1; i<m+1; i++) {
			for(int j=1; j<n+1; j++) {
				if(str1[i-1].equals(str2[j-1])==true) {
					c[i][j]=c[i-1][j-1]+1;
					
				}
				else
					if(c[i-1][j]>=c[i][j-1]) {
						c[i][j]=c[i-1][j];
					}
					else
						c[i][j]=c[i][j-1];
			}
		}
		return c[m][n];
		
	}

}
