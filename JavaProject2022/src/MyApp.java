import javax.swing.JFrame;

class MyFrame1 extends JFrame{

	public MyFrame1() {
		
		
		setTitle("Swing Frame 640*480 /MyFrameApp");
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* ���� ���� ���α׷� ����
		������ �ݱ� ��ư
		������ �����찡 ������ �ʰ� �Ǿ� ���� ���α׷��� ȭ�� �� �����
		���� ���α׷��� ���� ���� �ʾ�����, setVisible(true) ���� �� ȭ�鿡 �ٽ� ����
		���� ���� ���α׷��� �����ϸ� JVM�� ���� ������(main thread) �ܿ� �̺�Ʈ ó�� ������(Event Dispatch Thread)��
		����Ǳ� ������, ���� �����带 �����ص� �̺�Ʈ ó�� �����尡 ����Ǿ� ���� ���α׷��� ������� ����
		
		 ������ �ݱ� ��ư Ŭ�� �� ���� ���α׷� ���� �ϱ�
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
