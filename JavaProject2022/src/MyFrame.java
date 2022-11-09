import javax.swing.*;

public class MyFrame extends JFrame{
	
	//JFrame 상속

	public MyFrame() {
		setTitle("Swing Frame 640*480");//상단 메세지
		setSize(640,480);//화면 너비 640*480
		setVisible(true);//JFrame을 보이도록 설정
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메인 메소드에선 간결하게 프레임 생성하는 코드만 작성
		//실제 기능은 프레임 클래스에서 구현한다.
		MyFrame frame=new MyFrame();
		//마이프레임 객체 생성

	}

}
