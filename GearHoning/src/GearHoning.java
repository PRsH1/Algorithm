import java.math.*;
import java.util.*;



public class GearHoning {
	//��� Ŭ����
	Random rnd=new Random();
	private int gearRank;
	private int gear;
	private double successPercent;
	public GearHoning(int gearRank,int gear,double successPercent) {
		//������
		this.gear=gear;
		this.gearRank=gearRank;
		this.successPercent=successPercent;
	}
	
	public boolean honing(int gearRank,double successPercent,double artistanPercent){
		//��� ���� �� True ���� �ƴ� �� False ����
		if(gearRank<3 &&gearRank>0) {
			return true;

		}
		else if(artistanPercent>=100) {
			return true;
		}
		else {
			
			if(successPercent>=rnd.nextInt(10000)+1) {
				
				return true;
			}
			else
				
				return false;

		}
		

		
	}
	
}
