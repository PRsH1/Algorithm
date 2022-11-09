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
		System.out.println("��� �ùķ����Ϳ� ���� ���� ȯ���մϴ�");
		System.out.println("�ƺ근���� ����� ��� �ܰ踦 �����մϴ�\n");
		System.out.print("��� ��ÿ� ���� ������ ���ðڽ��ϱ�? (1)�� (2)�ƴϿ�: ");
		info=input.nextInt();
		if(info==1) {
			//info=1�̸� �ȳ��� ���
			infor.firstGearInfo();
		}
		
		else if(info!=2) {
			System.out.print("��ȿ�� ���� ���� �ƴմϴ� ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		while(true) {
			System.out.print("���� �Ǵ� �� ��� �� �ϳ��� �������ּ��� (1)���� (2)�� (0)����:");
			try {
				gear=input.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("���� �Է� �ʵ忡 �ٸ� ���� �Է��߽��ϴ� ���α׷��� �����մϴ�.");
				System.exit(0);
			}
			
			if(gear==1 || gear==2) {
				break;
			}
			else if(gear==0) {
				System.out.print("�ùķ����͸� �����մϴ�");
				System.exit(0);

			}
			else {
				System.out.println("�߸��� ���Դϴ� �ٽ� �Է����ּ���");
			}
		}
		System.out.print("���� ����� ��� �ܰ踦 �Է����ּ���(1~24):");
		try {
			presentGear=input.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("���� �Է� �ʵ忡 �ٸ� ���� �Է��߽��ϴ� ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
		if(presentGear<1 || presentGear>25) {
			System.out.print("�߸��� ��� ��ġ�Դϴ�");
		}
		else if(presentGear==25){
			System.out.print("�̹� �ְ� ��� �ܰ��Դϴ�");
		}
		else {
			System.out.print("����� �����Ͻðڽ��ϱ�? �����Ͻ÷��� 1���� �����ּ���: ");
			
			try {
				honingAccept=input.nextInt();
				if(honingAccept!=1) {
					System.out.print("����� �����մϴ�");
					System.exit(0);
				}
			}catch(InputMismatchException e) {
				System.out.println("���� �Է� �ʵ忡 �ٸ� ���� �Է��߽��ϴ� ���α׷��� �����մϴ�.");
				System.exit(0);
			}
			

			if(presentGear<3 &&presentGear>0) {
				if(honing.honing(presentGear,percent,artistanPercent)==true) {
					System.out.print("��� ��ÿ� �����Ͽ����ϴ�");

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
		//���� ��� ���¸� �ȳ��ϴ� �޼ҵ�
		if(artistanPercent>=100) {
			System.out.println("���� ��� Ȯ���� 100 % �Դϴ�\n");
			System.out.println("���� ������ ����� "+artistanPercent+ " % �Դϴ�\n");
			System.out.println("���� �Ҹ� ����� "+cost+" ��� �Դϴ�\n");
			
		}
		else {
			System.out.println("���� ��� Ȯ���� "+percent/100+ " % �Դϴ�");
			System.out.println("���� ������ ����� "+artistanPercent+ " % �Դϴ�\n");
			System.out.println("���� �Ҹ� ����� "+cost+" ��� �Դϴ�");
			System.out.println("������� �� �Ҹ� ����� "+totalCost+ " ��� �Դϴ�\n");
			
		}
		
	}
	public static int honingStart() {
		//��� ���� ���θ� ����� �޼ҵ�
		int honingAccept;
		Scanner input=new Scanner(System.in);
		System.out.print("����� ����Ͻðڽ��ϱ�? �����Ͻ÷��� 1���� �����ּ���:");
	    honingAccept=input.nextInt();
	    return honingAccept;
	}
	public static int honingSuccess(double artistanPercent,int totalCost,int honingTry,int presentGear) {
		//��� ���� �� ȣ��Ǵ� �޼ҵ�
		int gearRank=presentGear;
		if(artistanPercent>=100) {
			//���� �� �� if�� ����
			gearRank+=1;
			System.out.println("������ ����� �Ҹ��Ͽ� ��� ��ÿ� �����߽��ϴ�\n");
			System.out.println("��� �ܰ谡 "+presentGear+"�ܰ� ���� "+gearRank+"�ܰ�� ����߽��ϴ�\n");
			System.out.println("�� �Ҹ� ����� "+totalCost+" ��� �Դϴ�");
			System.out.print("�� ���� Ƚ���� "+honingTry+"ȸ �Դϴ�");
			
			return gearRank;
			
		}
		else {
			gearRank+=1;
			System.out.println("��� ��ÿ� �����Ͽ����ϴ�\n");
			System.out.println("��� �ܰ谡 "+presentGear+"�ܰ� ���� "+gearRank+"�ܰ�� ����߽��ϴ�\n");
			System.out.println("�� �Ҹ� ����� "+totalCost+" ��� �Դϴ�");
			System.out.print("�� ���� Ƚ���� "+honingTry+"ȸ �Դϴ�");
			
			return gearRank;
		}
			
	}
	public static void honingFailed(double percent,double oneTryPercent) {
		//��� ���� �� ȣ��Ǵ� �޼ҵ�
		double artistanPercent;
		if(percent>=2*oneTryPercent) {
			//���� Ƚ���� 10ȸ ������ ��
			System.out.println("��� ��ÿ� �����߽��ϴ�");
			artistanPercent=percent*0.00465;
			System.out.println("������ ����� "+String.format("%.2f", artistanPercent)+ "% ����մϴ�");
			System.out.println("�� �̻� �緬 ���з� ��� ��� ���� Ȯ���� �ø� �� �����ϴ�.\n");
		}
	
		else {
			System.out.println("��� ��ÿ� �����߽��ϴ�");
			artistanPercent=percent*0.00465;
			System.out.println("������ ����� "+String.format("%.2f", artistanPercent)+ "% ����մϴ�");
			System.out.println("���� Ȯ���� "+oneTryPercent/(double)1000+ "% ����մϴ�.\n" );
			
		}
		
		
	}
	public static double artistanPercentCalc(double artistanPercent,double percent) {
		//������ ��� ������ִ� �޼ҵ�
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
