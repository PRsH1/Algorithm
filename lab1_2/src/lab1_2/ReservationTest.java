package lab1_2;

public class ReservationTest {

	public static void main(String[] args) {
		System.out.println("lab1_2 : �̽���");
		Reservation [] array=new Reservation[2];//Reservation �迭 class ����
		array[0]=new Reservation(1,3,5);	
		array[1]=new Reservation(2,1,6);

		for(int i=0; i<array.length; i++) {
			//�ݺ���
			System.out.print(array[i].getId()+" "+array[i].getStartTime()+"��~"+array[i].getEndTime()+"�� "+array[i].getUseTime()+"�ð�\n");

		}


		// TODO Auto-generated method stub

	}

}
