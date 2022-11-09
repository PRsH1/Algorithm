package hw11_1;

public class ConferenceRoom {
	private int timeStart;
	private int timeEnd;
	
	public ConferenceRoom(int timeStart, int timeEnd) {
		super();
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	
		
	}
	public int getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(int timeStart) {
		this.timeStart = timeStart;
	}
	public int getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(int timeEnd) {
		this.timeEnd = timeEnd;
	}
	

}
