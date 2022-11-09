import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	
	public NullContainerEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);//setLayout��  null�� ���ڷ� ���� �� ��ġ ������ ���ŵ�
		for(int i=1; i<10; i++) {
			JButton btn=new JButton(Integer.toString(i));//Jbutton ��ü ����(1~9����)
			//integer.toString(i) Ÿ��ĳ�����Ͽ� ���ڸ� ���ڷ� �ٲ��ְ� 1~9���� ������
			btn.setBounds(20*i,20*i,50,20);//������Ʈ�� ���� ��ġ ����
			//20*i=���� ��� �𼭸� x��ǥ,y��ǥ 50:�ʺ� 20:����
			c.add(btn);//��ư �߰�
		}
		
		JLabel la=new JLabel("Hello, Press the button!");//�� ��ü �ϳ� ���� �޼��� ����
		la.setLocation(150,50);//�� �����̼� ����
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