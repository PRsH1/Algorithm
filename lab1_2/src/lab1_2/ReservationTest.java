package lab1_2;

public class ReservationTest {

	public static void main(String[] args) {
		System.out.println("lab1_2 : 이승현");
		Reservation [] array=new Reservation[2];//Reservation 배열 class 생성
		array[0]=new Reservation(1,3,5);	
		array[1]=new Reservation(2,1,6);

		for(int i=0; i<array.length; i++) {
			//반복문
			System.out.print(array[i].getId()+" "+array[i].getStartTime()+"시~"+array[i].getEndTime()+"시 "+array[i].getUseTime()+"시간\n");

		}


		// TODO Auto-generated method stub

	}

}
