package hw4_1;

import java.util.Random;

public class ReservationSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw4_1 : �̽���");
		Random random=new Random();
		int n=10;
		Reservation []array=new Reservation[n];
		//Reservation �迭 ��ü array �迭ũ�� 10 ����

		for(int i=0; i<array.length; i++) {
			//�ݺ���
			int startTime=random.nextInt(5)+1;
			//startTime ����,���� �Լ�
			int endTime=random.nextInt(6-startTime)+startTime+1;
			//endTime����, ���� �Լ�
			array[i]=new Reservation((i+1),startTime,endTime);//��ü �ʱ�ȭ��
			System.out.print(array[i].getId()+" "+array[i].getStartTime()+"��~"+array[i].getEndTime()+"�� "+array[i].getUseTime()+"�ð�\n");
			//���

		}
		reservationSort(array);//countingSort �޼ҵ� ȣ��
		System.out.println("���� �������� ���� ��� = ");
		for(int i=0; i<array.length; i++) {
			//�ݺ���

			System.out.print(array[i].getId()+" "+array[i].getStartTime()+"��~"+array[i].getEndTime()+"�� "+array[i].getUseTime()+"�ð�\n");
			//���

		}



	}
	public static void reservationSort(Reservation[] list) {
		//countingSort �޼ҵ�
		int []count=new int[5]; //��� �ð��� üũ�� ī��Ʈ �迭
		Reservation[] array=new Reservation[list.length];//���ĵ� �ʵ带 �־��� ���ο� Reservation�� �迭 array
		for(int i=0; i<5; i++) {
			//count �迭 �ʱ�ȭ
			count[i]=0;
		}
		for(int j=0; j<list.length; j++) {
			//�ݺ���
			count[list[j].getUseTime()-1]++;
			//���ð��� �ش��ϴ� ī���� �� ����
		}
		for(int i=1; i<5; i++) {
			//�ݺ���
			count[i]=count[i]+count[i-1];
			//��� ���� �˰���
		}
		for(int i=list.length-1; i>=0; i--) {
			//�ݺ���
			array[count[list[i].getUseTime()-1]-1]=list[i];
			//���ð��� ���Ϲ޾� array �迭�� list[i]�� ����Ű���� ����
			count[list[i].getUseTime()-1]--;
			//ī���� �� ����
		}
		for(int i=0; i<list.length; i++) {
			list[i]=array[i];
			//���ĵ� array[i]�� list[i]�� ����
		}
		





	}

}
