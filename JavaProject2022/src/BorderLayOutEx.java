import javax.swing.*;
import java.awt.*;

public class BorderLayOutEx extends JFrame {
	
	public BorderLayOutEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout(30,20));//BorderLayout 배치 방법,수평 30 수직 20
		c.add(new JButton("add"),BorderLayout.WEST);
		c.add(new JButton("sub"),BorderLayout.NORTH);
		c.add(new JButton("mul"),BorderLayout.SOUTH);
		c.add(new JButton("div"),BorderLayout.EAST);
		c.add(new JButton("calculate"),BorderLayout.CENTER);
		
		setSize(640,480);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderLayOutEx frame=new BorderLayOutEx();
		

	}

}
