package hw1_2;

public class ReservationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw1_2 : �̽���");
		Reservation []array=new Reservation[10];
		//Reservation �迭 ��ü array �迭ũ�� 10 ����
		int []count=new int[5];
		
		//��� �ð� üũ�� ���� count �迭 ����

		for(int i=0; i<10; i++) {
			//�ݺ���
			int usableTime=6;//startTime�� üŷ�ϱ� ���� ���� usableTime
			array[i]=new Reservation(i+1,0,0);//��ü �ʱ�ȭ��
			array[i].setStartTime((int)(Math.random()*5)+1);//seStarttTime�޼ҵ� �ҷ��ͼ� ���� �ð� ����
			usableTime=usableTime-array[i].getStartTime();//usableTime�� �� ����
			array[i].setEndTime((int)(Math.random()*usableTime)+array[i].getStartTime()+1);//setEndTime ȣ�� �� �� �ð� ����
			count[array[i].getUseTime()-1]++;//�ش��ϴ� ī���� �� ����
			System.out.print(array[i].getId()+" "+array[i].getStartTime()+"��~"+array[i].getEndTime()+"�� "+array[i].getUseTime()+"�ð�\n");
				//���
			
		}
		for(int a=1; a<6; a++) {
			//count �� ����ϴ� �ݺ���
			System.out.println(a+"�ð� = "+ count[a-1]);//count �� ���
		}


	}

}
