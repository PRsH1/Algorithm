package hw1_2;

public class ReservationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw1_2 : 이승현");
		Reservation []array=new Reservation[10];
		//Reservation 배열 객체 array 배열크기 10 생성
		int []count=new int[5];
		
		//사용 시간 체크를 위한 count 배열 선언

		for(int i=0; i<10; i++) {
			//반복문
			int usableTime=6;//startTime을 체킹하기 위한 변수 usableTime
			array[i]=new Reservation(i+1,0,0);//객체 초기화함
			array[i].setStartTime((int)(Math.random()*5)+1);//seStarttTime메소드 불러와서 시작 시간 설정
			usableTime=usableTime-array[i].getStartTime();//usableTime에 값 저장
			array[i].setEndTime((int)(Math.random()*usableTime)+array[i].getStartTime()+1);//setEndTime 호출 후 끝 시간 설정
			count[array[i].getUseTime()-1]++;//해당하는 카운터 값 증가
			System.out.print(array[i].getId()+" "+array[i].getStartTime()+"시~"+array[i].getEndTime()+"시 "+array[i].getUseTime()+"시간\n");
				//출력
			
		}
		for(int a=1; a<6; a++) {
			//count 값 출력하는 반복문
			System.out.println(a+"시간 = "+ count[a-1]);//count 값 출력
		}


	}

}
