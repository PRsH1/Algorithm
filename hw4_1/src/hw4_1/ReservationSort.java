package hw4_1;

import java.util.Random;

public class ReservationSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw4_1 : 이승현");
		Random random=new Random();
		int n=10;
		Reservation []array=new Reservation[n];
		//Reservation 배열 객체 array 배열크기 10 생성

		for(int i=0; i<array.length; i++) {
			//반복문
			int startTime=random.nextInt(5)+1;
			//startTime 설정,랜덤 함수
			int endTime=random.nextInt(6-startTime)+startTime+1;
			//endTime설정, 랜덤 함수
			array[i]=new Reservation((i+1),startTime,endTime);//객체 초기화됨
			System.out.print(array[i].getId()+" "+array[i].getStartTime()+"시~"+array[i].getEndTime()+"시 "+array[i].getUseTime()+"시간\n");
			//출력

		}
		reservationSort(array);//countingSort 메소드 호출
		System.out.println("길이 오름차순 정렬 결과 = ");
		for(int i=0; i<array.length; i++) {
			//반복문

			System.out.print(array[i].getId()+" "+array[i].getStartTime()+"시~"+array[i].getEndTime()+"시 "+array[i].getUseTime()+"시간\n");
			//출력

		}



	}
	public static void reservationSort(Reservation[] list) {
		//countingSort 메소드
		int []count=new int[5]; //사용 시간을 체크할 카운트 배열
		Reservation[] array=new Reservation[list.length];//정렬된 필드를 넣어줄 새로운 Reservation형 배열 array
		for(int i=0; i<5; i++) {
			//count 배열 초기화
			count[i]=0;
		}
		for(int j=0; j<list.length; j++) {
			//반복문
			count[list[j].getUseTime()-1]++;
			//사용시간에 해당하는 카운터 값 증가
		}
		for(int i=1; i<5; i++) {
			//반복문
			count[i]=count[i]+count[i-1];
			//계수 정렬 알고리즘
		}
		for(int i=list.length-1; i>=0; i--) {
			//반복문
			array[count[list[i].getUseTime()-1]-1]=list[i];
			//사용시간을 리턴받아 array 배열이 list[i]를 가리키도록 설정
			count[list[i].getUseTime()-1]--;
			//카운터 값 감소
		}
		for(int i=0; i<list.length; i++) {
			list[i]=array[i];
			//정렬된 array[i]를 list[i]에 삽입
		}
		





	}

}
