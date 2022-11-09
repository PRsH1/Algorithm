import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	
	public ContentPaneEx() {
		
		setTitle("contentpane과 JFrame");//타이틀 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x버튼 누를 시 프로그램 종료
		
		Container contentPane=getContentPane();//컨텐트 pane 객체 생성(새 컴포넌트 추가를 위함)
		contentPane.setBackground(Color.orange);//배경화면 주황색으로 설정
		contentPane.setLayout(new FlowLayout());//배치 관리자,왼쪽에서 오른쪽으로 배치됨
		
		contentPane.add(new JButton("ok"));//컴포넌트
		contentPane.add(new JButton("cancle"));//컴포넌트
		contentPane.add(new JButton("ignore"));//컴포넌트
		
		setSize(640,480);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContentPaneEx frame=new ContentPaneEx();
		

	}

}
