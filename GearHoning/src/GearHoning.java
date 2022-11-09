import java.math.*;
import java.util.*;



public class GearHoning {
	//재련 클래스
	Random rnd=new Random();
	private int gearRank;
	private int gear;
	private double successPercent;
	public GearHoning(int gearRank,int gear,double successPercent) {
		//생성자
		this.gear=gear;
		this.gearRank=gearRank;
		this.successPercent=successPercent;
	}
	
	public boolean honing(int gearRank,double successPercent,double artistanPercent){
		//재련 성공 시 True 리턴 아닐 시 False 리턴
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
