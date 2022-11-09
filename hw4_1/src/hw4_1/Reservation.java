package hw4_1;

public class Reservation {
	private int id; //���� ��ȣ
	private int startTime; //���� �ð�
	private int endTime;   //���� �ð�
	public Reservation(int id, int startTime, int endTime) {
		//������ Reservation
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public int getStartTime() {
		//���� �ð� get�޼ҵ�
		return startTime;
	}
	public void setStartTime(int startTime) {
		//���� �ð� set�޼ҵ�
		this.startTime = startTime;
	}
	public int getEndTime() {
		//���� �ð� get�޼ҵ�
		return endTime;
	}
	public void setEndTime(int endTime) {
		//���� �ð� set�żҵ�
		this.endTime = endTime;
	}
	public int getId() {
		//���� ��ȣ get�޼ҵ�
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	@Override
	public String toString() {
		//toString�޼ҵ� �������̵�
		return "Reservation [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	public int getUseTime() {
		//��� �ð� get�޼ҵ�
		int time=endTime-startTime;
		return time;

	}

}