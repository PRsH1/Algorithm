import java.util.*;

public class GearInfo {
	//��� �ȳ� class
	private int info;
	Scanner input=new Scanner(System.in);
	
	public void firstGearInfo() {
		System.out.println("�ȳ����� ���� ���� ȯ���մϴ�");
		while(true) {
			System.out.print("�ñ��� ������ ������ �ּ��� (1)��� ��� Ȯ���� ���ؼ� (2)������ ����̶� (3)��� ������� ���ư���: " );
			info=input.nextInt();
			if(info==1) {
				honingInfo();
			}
			else if(info==2) {
				artistanInfo();
			}
			else if(info==3) {
				break;
			}
			else {
				System.out.print("�߸��� ���� ���Դϴ� ���α׷��� �����մϴ�.");
				System.exit(0);
			}
		}
		
	}
	public void honingInfo() {
		//��� �ܰ躰 Ȯ�� �˷��ִ� �޼ҵ�
		System.out.println();
		System.out.println("�� ��� �ùķ����ʹ� �ƺ근���� ����� ����� �����մϴ�.\n�ƺ근���� ����� ��� Ȯ���� 1~2�ܰ迡�� 100%�� Ȯ���� �����մϴ�");
		System.out.println("3~5�ܰ迡�� 45%");
		System.out.println("6~8�ܰ迡�� 30%");
		System.out.println("9~10�ܰ迡�� 15%");
		System.out.println("11~12�ܰ迡�� 10%");
		System.out.println("13~14�ܰ迡�� 5%");
		System.out.println("15~16�ܰ迡�� 4%");
		System.out.println("17~18�ܰ迡�� 3%");
		System.out.println("19~20�ܰ迡�� 1.5%");
		System.out.println("21~22�ܰ迡�� 1%");
		System.out.println("23~24�ܰ迡�� 0.5% �Դϴ�\n");
		System.out.println("���� ��� �������� ù �õ����� 10ȸ���� ù �������� 10%��ŭ ����մϴ�.\n��� �������� ù �������� 2�踦 �ʰ��Ͽ� ����� �� �����ϴ�.\n");
	}
	public void artistanInfo() {
		//������ ��� ���� ��� �����ϴ� �޼ҵ�
		System.out.println();
		System.out.println("������ ����� ��� ���� �� ���� �������� 46.5%��ŭ �����˴ϴ�. \n�� ��ġ�� 100%�� �Ǹ� ������ �⹮�� �Ҹ��Ͽ� Ȯ�������� ��� ����� �����ϰ� �˴ϴ�");
		System.out.println("��� �����ε� ��� ��ÿ� �����ϰ� �Ǹ� ������ ����� �ʱ�ȭ�˴ϴ�.\n");
	}
	

}