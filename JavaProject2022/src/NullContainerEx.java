import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	
	public NullContainerEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);//setLayout에  null을 인자로 전달 시 배치 관리자 제거됨
		for(int i=1; i<10; i++) {
			JButton btn=new JButton(Integer.toString(i));//Jbutton 객체 생성(1~9까지)
			//integer.toString(i) 타입캐스팅하여 숫자를 문자로 바꿔주고 1~9까지 삽입함
			btn.setBounds(20*i,20*i,50,20);//컴포넌트의 절대 위치 지정
			//20*i=왼쪽 상단 모서리 x좌표,y좌표 50:너비 20:높이
			c.add(btn);//버튼 추가
		}
		
		JLabel la=new JLabel("Hello, Press the button!");//라벨 객체 하나 생성 메세지 지정
		la.setLocation(150,50);//라벨 로케이션 지정
		la.setSize(150,20);
		c.add(la);
		
	

		
		setSize(640,480);
		setVisible(true);
		
		JPanel p=new JPanel();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullContainerEx frame=new NullContainerEx();
		

	}

}
