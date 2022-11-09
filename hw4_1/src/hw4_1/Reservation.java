package hw4_1;

public class Reservation {
	private int id; //예약 변호
	private int startTime; //시작 시간
	private int endTime;   //종료 시간
	public Reservation(int id, int startTime, int endTime) {
		//생성자 Reservation
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public int getStartTime() {
		//시작 시간 get메소드
		return startTime;
	}
	public void setStartTime(int startTime) {
		//시작 시간 set메소드
		this.startTime = startTime;
	}
	public int getEndTime() {
		//종료 시간 get메소드
		return endTime;
	}
	public void setEndTime(int endTime) {
		//종료 시간 set매소드
		this.endTime = endTime;
	}
	public int getId() {
		//예약 번호 get메소드
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	@Override
	public String toString() {
		//toString메소드 오버라이드
		return "Reservation [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	public int getUseTime() {
		//사용 시간 get메소드
		int time=endTime-startTime;
		return time;

	}

}