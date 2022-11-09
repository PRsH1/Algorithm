import javax.swing.JFrame;

class MyFrame1 extends JFrame{

	public MyFrame1() {
		
		
		setTitle("Swing Frame 640*480 /MyFrameApp");
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* 스윙 응용 프로그램 종료
		프레임 닫기 버튼
		프레임 윈도우가 보이지 않게 되어 응용 프로그램이 화면 상에 사라짐
		실제 프로그램이 종료 되지 않았으며, setVisible(true) 설정 시 화면에 다시 노출
		스윙 응용 프로그램을 실행하면 JVM이 메인 스레드(main thread) 외에 이벤트 처리 스레드(Event Dispatch Thread)가
		실행되기 때문에, 메인 스레드를 종료해도 이벤트 처리 스레드가 실행되어 응용 프로그램이 종료되지 않음
		
		 프레임 닫기 버튼 클릭 시 응용 프로그램 종료 하기
			 system.exit(0);
		     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		*/
		
	}
}


public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFrame1 frame=new MyFrame1();
	}

}
