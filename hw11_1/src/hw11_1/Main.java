package hw11_1;

import java.util.Scanner;

public class Main {

	static int []arrayStart;
	static int []arrayEnd;
    static int []temp;
	static int []temp2;
	static int conferTime;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		conferTime=scan.nextInt();
		arrayStart=new int[conferTime];
		arrayEnd=new int[conferTime];
		temp=new int[conferTime];
		temp2=new int[conferTime];
		for(int i=0; i<conferTime; i++) {
			int startTime=scan.nextInt();
			int endTime=scan.nextInt();
			arrayStart[i]=startTime;
			arrayEnd[i]=endTime;

		}
		mergeSortStart(arrayStart,arrayEnd,0,conferTime-1);
		mergeSortEnd(arrayStart,arrayEnd,0,conferTime-1);
		for(int i=0; i<conferTime; i++) {
			System.out.print(arrayStart[i]+" ");
		}
		System.out.println();
		for(int i=0; i<conferTime; i++) {
			System.out.print(arrayEnd[i]+" ");
		}
		System.out.println();
		System.out.print(conferSort(arrayStart,arrayEnd));



	}
	
	public static void mergeSortStart(int[]arrayStart,int[]arrayEnd,int start,int end) {
		int middle=0;
		if(start<end) {
			middle=(start+end)/2;
			mergeSortStart(arrayStart,arrayEnd,start,middle);
			mergeSortStart(arrayStart,arrayEnd,middle+1,end);
			mergeStart(arrayStart,arrayEnd,start,middle,end);
		}

	}
	public static void mergeStart(int []arrayStart,int[]arrayEnd,int start,int middle,int end) {
		int startPoint=start;
		int startPoint2=start;
		int endPoint=middle+1;
		int endPoint2=middle+1;
		int sortedIndex=start;
		int sortedIndex2=start;

		while(startPoint<=middle && endPoint<=end) {
			if(arrayStart[startPoint]<=arrayStart[endPoint]) {
				temp[sortedIndex++]=arrayEnd[startPoint++];
				temp2[sortedIndex2++]=arrayStart[startPoint2++];
			}
			else {
				temp[sortedIndex++]=arrayEnd[endPoint++];
				temp2[sortedIndex2++]=arrayStart[endPoint2++];
			}
		}
		if(startPoint>middle) {
			for(int i=endPoint; i<=end; i++) {
				temp[sortedIndex++]=arrayEnd[i];
				temp2[sortedIndex2++]=arrayStart[i];
			}
		}
		else {
			for(int i=startPoint; i<=middle; i++) {
				temp[sortedIndex++]=arrayEnd[i];
				temp2[sortedIndex2++]=arrayStart[i];
			}
		}
		for(int i=start; i<=end; i++) {
			arrayEnd[i]=temp[i];
			arrayStart[i]=temp2[i];
		}

	}
	public static void mergeSortEnd(int[]arrayStart,int[]arrayEnd,int start,int end) {
		int middle=0;
		if(start<end) {
			middle=(start+end)/2;
			mergeSortEnd(arrayStart,arrayEnd,start,middle);
			mergeSortEnd(arrayStart,arrayEnd,middle+1,end);
			mergeEnd(arrayStart,arrayEnd,start,middle,end);
		}

	}
	public static void mergeEnd(int []arrayStart,int[]arrayEnd,int start,int middle,int end) {
		int startPoint=start;
		int startPoint2=start;
		int endPoint=middle+1;
		int endPoint2=middle+1;
		int sortedIndex=start;
		int sortedIndex2=start;

		while(startPoint<=middle && endPoint<=end) {
			if(arrayEnd[startPoint]<=arrayEnd[endPoint]) {
				temp[sortedIndex++]=arrayEnd[startPoint++];
				temp2[sortedIndex2++]=arrayStart[startPoint2++];
			}
			else {
				temp[sortedIndex++]=arrayEnd[endPoint++];
				temp2[sortedIndex2++]=arrayStart[endPoint2++];
			}
		}
		if(startPoint>middle) {
			for(int i=endPoint; i<=end; i++) {
				temp[sortedIndex++]=arrayEnd[i];
				temp2[sortedIndex2++]=arrayStart[i];
			}
		}
		else {
			for(int i=startPoint; i<=middle; i++) {
				temp[sortedIndex++]=arrayEnd[i];
				temp2[sortedIndex2++]=arrayStart[i];
			}
		}
		for(int i=start; i<=end; i++) {
			arrayEnd[i]=temp[i];
			arrayStart[i]=temp2[i];
		}

	}
	
	public static int conferSort(int []arrayStart,int []arrayEnd) {
		int count=0;
		int check=0;
		for(int i=0; i<conferTime; i++) {
			if(check<=arrayStart[i] && arrayEnd[i]>=arrayStart[i]) {
				check=arrayEnd[i];
				count++;

			}
		}
		return count;

		
	}

}
