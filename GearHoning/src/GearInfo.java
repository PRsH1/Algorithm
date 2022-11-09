import java.util.*;

public class GearInfo {
	//재련 안내 class
	private int info;
	Scanner input=new Scanner(System.in);
	
	public void firstGearInfo() {
		System.out.println("안내서에 오신 것을 환영합니다");
		while(true) {
			System.out.print("궁금한 사항을 선택해 주세요 (1)장비 재련 확률에 대해서 (2)장인의 기운이란 (3)장비 재련으로 돌아가기: " );
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
				System.out.print("잘못된 정수 값입니다 프로그램을 종료합니다.");
				System.exit(0);
			}
		}
		
	}
	public void honingInfo() {
		//재련 단계별 확률 알려주는 메소드
		System.out.println();
		System.out.println("이 재련 시뮬레이터는 아브렐슈드 장비의 재련을 지원합니다.\n아브렐슈드 장비의 재련 확률은 1~2단계에서 100%의 확률로 성공합니다");
		System.out.println("3~5단계에선 45%");
		System.out.println("6~8단계에선 30%");
		System.out.println("9~10단계에선 15%");
		System.out.println("11~12단계에선 10%");
		System.out.println("13~14단계에선 5%");
		System.out.println("15~16단계에선 4%");
		System.out.println("17~18단계에선 3%");
		System.out.println("19~20단계에선 1.5%");
		System.out.println("21~22단계에선 1%");
		System.out.println("23~24단계에선 0.5% 입니다\n");
		System.out.println("또한 재련 성공률은 첫 시도부터 10회까지 첫 성공률의 10%만큼 상승합니다.\n재련 성공률은 첫 성공률의 2배를 초과하여 상승할 수 없습니다.\n");
	}
	public void artistanInfo() {
		//장인의 기운 동작 방식 설명하는 메소드
		System.out.println();
		System.out.println("장인의 기운은 재련 실패 시 현재 성공률의 46.5%만큼 적립됩니다. \n이 수치가 100%가 되면 장인의 기문을 소모하여 확정적으로 장비 재련을 성공하게 됩니다");
		System.out.println("어떠한 이유로든 장비 재련에 성공하게 되면 장인의 기운은 초기화됩니다.\n");
	}
	

}
