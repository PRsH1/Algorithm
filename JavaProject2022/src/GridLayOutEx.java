import javax.swing.*;
import java.awt.*;

public class GridLayOutEx extends JFrame {
	
	public GridLayOutEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));//�׸��� ���̾ƿ� ��ġ������ 4�� 2��
		c.add(new JLabel("�̸�"));
		c.add(new JTextField("�̸� �ʵ带 �Է��ϼ���"));//�ؽ�Ʈ �ʵ� �ȳ��޼��� html�� placeholder�� ���
		c.add(new JLabel("����"));
		c.add(new JTextField("���� �ʵ带 �Է��ϼ���"));
		c.add(new JLabel("�й�"));
		c.add(new JTextField("�й� �ʵ带 �Է��ϼ���"));
		c.add(new JLabel("����"));
		c.add(new JTextField("���� �ʵ带 �Է��ϼ���"));
	
		
		setSize(640,480);
		setVisible(true);
		
		JPanel p=new JPanel();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayOutEx frame=new GridLayOutEx();
		

	}

}