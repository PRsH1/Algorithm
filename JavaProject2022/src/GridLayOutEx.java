import javax.swing.*;
import java.awt.*;

public class GridLayOutEx extends JFrame {
	
	public GridLayOutEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));//그리드 레이아웃 배치관리자 4행 2열
		c.add(new JLabel("이름"));
		c.add(new JTextField("이름 필드를 입력하세요"));//텍스트 필드 안내메세지 html의 placeholder과 비슷
		c.add(new JLabel("전공"));
		c.add(new JTextField("전공 필드를 입력하세요"));
		c.add(new JLabel("학번"));
		c.add(new JTextField("학번 필드를 입력하세요"));
		c.add(new JLabel("과목"));
		c.add(new JTextField("과목 필드를 입력하세요"));
	
		
		setSize(640,480);
		setVisible(true);
		
		JPanel p=new JPanel();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayOutEx frame=new GridLayOutEx();
		

	}

}
