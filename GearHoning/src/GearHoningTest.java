import java.util.*;



public class GearHoningTest {

	public static void main(String[] args) {
		int gear = 0;
		int presentGear = 0;
		int cost = 0;
		int info=0;
		double percent = 0;
		double oneTryPercent;
		double artistanPercent=0;
		int honingAccept = 0;
		int totalCost=0;
		int honingTry = 0;
		GearHoning honing=new GearHoning(0,0,0);
		GearInfo infor=new GearInfo();
		Scanner input=new Scanner(System.in);
		HoningCost honingCost=new HoningCost(0);
		// TODO Auto-generated method stub
		System.out.println("재련 시뮬레이터에 오신 것을 환영합니다");
		System.out.println("아브렐슈드 장비의 재련 단계를 지원합니다\n");
		System.out.print("장비 재련에 관한 설명서를 보시겠습니까? (1)예 (2)아니오: ");
		info=input.nextInt();
		if(info==1) {
			//info=1이면 안내문 출력
			infor.firstGearInfo();
		}
		
		else if(info!=2) {
			System.out.print("유효한 정수 값이 아닙니다 프로그램을 종료합니다.");
			System.exit(0);
		}
		while(true) {
			System.out.print("무기 또는 방어구 재련 중 하나를 선택해주세요 (1)무기 (2)방어구 (0)종료:");
			try {
				gear=input.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수 입력 필드에 다른 값을 입력했습니다 프로그램을 종료합니다.");
				System.exit(0);
			}
			
			if(gear==1 || gear==2) {
				break;
			}
			else if(gear==0) {
				System.out.print("시뮬레이터를 종료합니다");
				System.exit(0);

			}
			else {
				System.out.println("잘못된 값입니다 다시 입력해주세요");
			}
		}
		System.out.print("현재 장비의 재련 단계를 입력해주세요(1~24):");
		try {
			presentGear=input.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("정수 입력 필드에 다른 값을 입력했습니다 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		if(presentGear<1 || presentGear>25) {
			System.out.print("잘못된 재련 수치입니다");
		}
		else if(presentGear==25){
			System.out.print("이미 최고 재련 단계입니다");
		}
		else {
			System.out.print("재련을 진행하시겠습니까? 진행하시려면 1번을 눌러주세요: ");
			
			try {
				honingAccept=input.nextInt();
				if(honingAccept!=1) {
					System.out.print("재련을 종료합니다");
					System.exit(0);
				}
			}catch(InputMismatchException e) {
				System.out.println("정수 입력 필드에 다른 값을 입력했습니다 프로그램을 종료합니다.");
				System.exit(0);
			}
			

			if(presentGear<3 &&presentGear>0) {
				if(honing.honing(presentGear,percent,artistanPercent)==true) {
					System.out.print("장비 재련에 성공하였습니다");

				}
			}
			else if(presentGear>=3 &&  presentGear<=5) {
				oneTryPercent=4500;
				percent=4500;
				if(gear==1) {
					cost=honingCost.weaponCost(presentGear);
				
				}
				else
					cost=honingCost.armorCost(presentGear);
				
				while(honingAccept==1) {
					honingInformation(percent,artistanPercent, cost, totalCost);
					honingStart();
					if(honingAccept!=1) {
						System.exit(0);
						
					}
					else {
						if(honing.honing(presentGear, percent,artistanPercent)==true) {
							totalCost+=cost;
							honingTry+=1;
							presentGear=honingSuccess(artistanPercent, totalCost, honingTry, presentGear);
							break;
						}
						else {
							artistanPercent=artistanPercentCalc(artistanPercent,percent);
							totalCost+=cost;
							honingTry+=1;
							honingFailed(percent,oneTryPercent);
							if(percent<2*oneTryPercent)
								percent=percent+oneTryPercent/(double)10;
					
						}
					}
				}
				

			}
			else if(presentGear>=6 && presentGear<=8) {
				oneTryPercent=3000;
				percent=3000;
				if(gear==1) {
					cost=honingCost.weaponCost(presentGear);
				
				}
				else
					cost=honingCost.armorCost(presentGear);
				
				while(honingAccept==1) {
					honingInformation(percent,artistanPercent, cost, totalCost);
					honingStart();
					if(honingAccept!=1) {
						System.exit(0);
						
					}
					else {
						if(honing.honing(presentGear, percent,artistanPercent)==true) {
							totalCost+=cost;
							honingTry+=1;
							presentGear=honingSuccess(artistanPercent, totalCost, honingTry, presentGear);
							break;
						}
						else {
							artistanPercent=artistanPercentCalc(artistanPercent,percent);
							totalCost+=cost;
							honingTry+=1;
							honingFailed(percent,oneTryPercent);
							if(percent<2*oneTryPercent)
								percent=percent+oneTryPercent/(double)10;
					
						}
					}
				}

			}
			else if(presentGear==9 || presentGear==10) {
				oneTryPercent=1500;
				percent=1500;
				if(gear==1) {
					cost=honingCost.weaponCost(presentGear);
				
				}
				else
					cost=honingCost.armorCost(presentGear);
				
				while(honingAccept==1) {
					honingInformation(percent,artistanPercent, cost, totalCost);
					honingStart();
					if(honingAccept!=1) {
						System.exit(0);
						
					}
					else {
						if(honing.honing(presentGear, percent,artistanPercent)==true) {
							totalCost+=cost;
							honingTry+=1;
							presentGear=honingSuccess(artistanPercent, totalCost, honingTry, presentGear);
							break;
						}
						else {
							artistanPercent=artistanPercentCalc(artistanPercent,percent);
							totalCost+=cost;
							honingTry+=1;
							honingFailed(percent,oneTryPercent);
							if(percent<2*oneTryPercent)
								percent=percent+oneTryPercent/(double)10;
					
						}
					}
				}

			}
			else if(presentGear==11 || presentGear==12) {
				oneTryPercent=1000;
				percent=1000;
				if(gear==1) {
					cost=honingCost.weaponCost(presentGear);
				
				}
				else
					cost=honingCost.armorCost(presentGear);
				
				while(honingAccept==1) {
					honingInformation(percent,artistanPercent, cost, totalCost);
					honingStart();
					if(honingAccept!=1) {
						System.exit(0);
						
					}
					else {
						if(honing.honing(presentGear, percent,artistanPercent)==true) {
							totalCost+=cost;
							honingTry+=1;
							presentGear=honingSuccess(artistanPercent, totalCost, honingTry, presentGear);
							break;
						}
						else {
							artistanPercent=artistanPercentCalc(artistanPercent,percent);
							totalCost+=cost;
							honingTry+=1;
							honingFailed(percent,oneTryPercent);
							if(percent<2*oneTryPercent)
								percent=percent+oneTryPercent/(double)10;
					
						}
					}
				}

			}
			else if(presentGear==13 || presentGear==14) {
				oneTryPercent=500;
				percent=500;
				if(gear==1) {
					cost=honingCost.weaponCost(presentGear);
				
				}
				else
					cost=honingCost.armorCost(presentGear);
				
				while(honingAccept==1) {
					honingInformation(percent,artistanPercent, cost, totalCost);
					honingStart();
					if(honingAccept!=1) {
						System.exit(0);
						
					}
					else {
						if(honing.honing(presentGear, percent,artistanPercent)==true) {
							totalCost+=cost;
							honingTry+=1;
							presentGear=honingSuccess(artistanPercent, totalCost, honingTry, presentGear);
							break;
						}
						else {
							artistanPercent=artistanPercentCalc(artistanPercent,percent);
							totalCost+=cost;
							honingTry+=1;
							honingFailed(percent,oneTryPercent);
							if(percent<2*oneTryPercent)
								percent=percent+oneTryPercent/(double)10;
					
						}
					}
				}

			}
			else if(presentGear==15 || presentGear==16) {
				oneTryPercent=400;
				percent=400;
				if(gear==1) {
					cost=honingCost.weaponCost(presentGear);
				
				}
				else
					cost=honingCost.armorCost(presentGear);
				
				while(honingAccept==1) {
					honingInformation(percent,artistanPercent, cost, totalCost);
					honingStart();
					if(honingAccept!=1) {
						System.exit(0);
						
					}
					else {
						if(honing.honing(presentGear, percent,artistanPercent)==true) {
							totalCost+=cost;
							honingTry+=1;
							presentGear=honingSuccess(artistanPercent, totalCost, honingTry, presentGear);
							break;
						}
						else {
							artistanPercent=artistanPercentCalc(artistanPercent,percent);
							totalCost+=cost;
							honingTry+=1;
							honingFailed(percent,oneTryPercent);
							if(percent<2*oneTryPercent)
								percent=percent+oneTryPercent/(double)10;
					
						}
					}
				}

			}
			else if(presentGear==17 || presentGear==18) {
				oneTryPercent=300;
				percent=300;
				if(gear==1) {
					cost=honingCost.weaponCost(presentGear);
				
				}
				else
					cost=honingCost.armorCost(presentGear);
				
				while(honingAccept==1) {
					honingInformation(percent,artistanPercent, cost, totalCost);
					honingStart();
					if(honingAccept!=1) {
						System.exit(0);
						
					}
					else {
						if(honing.honing(presentGear, percent,artistanPercent)==true) {
							totalCost+=cost;
							honingTry+=1;
							presentGear=honingSuccess(artistanPercent, totalCost, honingTry, presentGear);
							break;
						}
						else {
							artistanPercent=artistanPercentCalc(artistanPercent,percent);
							totalCost+=cost;
							honingTry+=1;
							honingFailed(percent,oneTryPercent);
							if(percent<2*oneTryPercent)
								percent=percent+oneTryPercent/(double)10;
					
						}
					}
				}

			}
			else if(presentGear==19 || presentGear==20) {
				oneTryPercent=150;
				percent=150;
				if(gear==1) {
					cost=honingCost.weaponCost(presentGear);
				
				}
				else
					cost=honingCost.armorCost(presentGear);
				
				while(honingAccept==1) {
					honingInformation(percent,artistanPercent, cost, totalCost);
					honingStart();
					if(honingAccept!=1) {
						System.exit(0);
						
					}
					else {
						if(honing.honing(presentGear, percent,artistanPercent)==true) {
							totalCost+=cost;
							honingTry+=1;
							presentGear=honingSuccess(artistanPercent, totalCost, honingTry, presentGear);
							break;
						}
						else {
							artistanPercent=artistanPercentCalc(artistanPercent,percent);
							totalCost+=cost;
							honingTry+=1;
							honingFailed(percent,oneTryPercent);
							if(percent<2*oneTryPercent)
								percent=percent+oneTryPercent/(double)10;
					
						}
					}
				}

			}
			else if(presentGear==21 || presentGear==22) {
				oneTryPercent=100;
				percent=100;
				if(gear==1) {
					cost=honingCost.weaponCost(presentGear);
				
				}
				else
					cost=honingCost.armorCost(presentGear);
				
				while(honingAccept==1) {
					honingInformation(percent,artistanPercent, cost, totalCost);
					honingStart();
					if(honingAccept!=1) {
						System.exit(0);
						
					}
					else {
						if(honing.honing(presentGear, percent,artistanPercent)==true) {
							totalCost+=cost;
							honingTry+=1;
							presentGear=honingSuccess(artistanPercent, totalCost, honingTry, presentGear);
							break;
						}
						else {
							artistanPercent=artistanPercentCalc(artistanPercent,percent);
							totalCost+=cost;
							honingTry+=1;
							honingFailed(percent,oneTryPercent);
							if(percent<2*oneTryPercent)
								percent=percent+oneTryPercent/(double)10;
					
						}
					}
				}

			}
			else if(presentGear==23 || presentGear==24) {
				oneTryPercent=50;
				percent=50;
				if(gear==1) {
					cost=honingCost.weaponCost(presentGear);
				
				}
				else
					cost=honingCost.armorCost(presentGear);
				
				while(honingAccept==1) {
					honingInformation(percent,artistanPercent, cost, totalCost);
					honingStart();
					if(honingAccept!=1) {
						System.exit(0);
						
					}
					else {
						if(honing.honing(presentGear, percent,artistanPercent)==true) {
							totalCost+=cost;
							honingTry+=1;
							presentGear=honingSuccess(artistanPercent, totalCost, honingTry, presentGear);
							break;
						}
						else {
							artistanPercent=artistanPercentCalc(artistanPercent,percent);
							totalCost+=cost;
							honingTry+=1;
							honingFailed(percent,oneTryPercent);
							if(percent<2*oneTryPercent)
								percent=percent+oneTryPercent/(double)10;
					
						}
					}
				}

			}



		}

	}
	public static void honingInformation(double percent,double artistanPercent,int cost,int totalCost) {
		//현재 재련 상태를 안내하는 메소드
		if(artistanPercent>=100) {
			System.out.println("현재 재련 확률은 100 % 입니다\n");
			System.out.println("현재 장인의 기운은 "+artistanPercent+ " % 입니다\n");
			System.out.println("현재 소모 비용은 "+cost+" 골드 입니다\n");
			
		}
		else {
			System.out.println("현재 재련 확률은 "+percent/100+ " % 입니다");
			System.out.println("현재 장인의 기운은 "+artistanPercent+ " % 입니다\n");
			System.out.println("현재 소모 비용은 "+cost+" 골드 입니다");
			System.out.println("현재까지 총 소모 비용은 "+totalCost+ " 골드 입니다\n");
			
		}
		
	}
	public static int honingStart() {
		//재련 시작 여부를 물어보는 메소드
		int honingAccept;
		Scanner input=new Scanner(System.in);
		System.out.print("재련을 계속하시겠습니까? 진행하시려면 1번을 눌러주세요:");
	    honingAccept=input.nextInt();
	    return honingAccept;
	}
	public static int honingSuccess(double artistanPercent,int totalCost,int honingTry,int presentGear) {
		//재련 성공 시 호출되는 메소드
		int gearRank=presentGear;
		if(artistanPercent>=100) {
			//장기백 시 이 if문 동작
			gearRank+=1;
			System.out.println("장인의 기운을 소모하여 장비 재련에 성공했습니다\n");
			System.out.println("장비 단계가 "+presentGear+"단계 에서 "+gearRank+"단계로 상승했습니다\n");
			System.out.println("총 소모 비용은 "+totalCost+" 골드 입니다");
			System.out.print("총 시행 횟수는 "+honingTry+"회 입니다");
			
			return gearRank;
			
		}
		else {
			gearRank+=1;
			System.out.println("장비 재련에 성공하였습니다\n");
			System.out.println("장비 단계가 "+presentGear+"단계 에서 "+gearRank+"단계로 상승했습니다\n");
			System.out.println("총 소모 비용은 "+totalCost+" 골드 입니다");
			System.out.print("총 시행 횟수는 "+honingTry+"회 입니다");
			
			return gearRank;
		}
			
	}
	public static void honingFailed(double percent,double oneTryPercent) {
		//재련 실패 시 호출되는 메소드
		double artistanPercent;
		if(percent>=2*oneTryPercent) {
			//시행 횟수가 10회 이하일 때
			System.out.println("장비 재련에 실패했습니다");
			artistanPercent=percent*0.00465;
			System.out.println("장인의 기운이 "+String.format("%.2f", artistanPercent)+ "% 상승합니다");
			System.out.println("더 이상 재랸 실패로 장비 재련 성공 확률을 올릴 수 없습니다.\n");
		}
	
		else {
			System.out.println("장비 재련에 실패했습니다");
			artistanPercent=percent*0.00465;
			System.out.println("장인의 기운이 "+String.format("%.2f", artistanPercent)+ "% 상승합니다");
			System.out.println("성공 확률이 "+oneTryPercent/(double)1000+ "% 상승합니다.\n" );
			
		}
		
		
	}
	public static double artistanPercentCalc(double artistanPercent,double percent) {
		//장인의 기운 계산해주는 메소드
		artistanPercent=artistanPercent+percent*0.00465;
		artistanPercent=Math.round(artistanPercent*100)/100.0;
		if(artistanPercent>=100) {
			artistanPercent=100.00;
			return artistanPercent;
		}
		else
			return artistanPercent;
	}
	

}
