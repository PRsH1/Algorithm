import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	
	public ContentPaneEx() {
		
		setTitle("contentpane�� JFrame");//Ÿ��Ʋ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x��ư ���� �� ���α׷� ����
		
		Container contentPane=getContentPane();//����Ʈ pane ��ü ����(�� ������Ʈ �߰��� ����)
		contentPane.setBackground(Color.orange);//���ȭ�� ��Ȳ������ ����
		contentPane.setLayout(new FlowLayout());//��ġ ������,���ʿ��� ���������� ��ġ��
		
		contentPane.add(new JButton("ok"));//������Ʈ
		contentPane.add(new JButton("cancle"));//������Ʈ
		contentPane.add(new JButton("ignore"));//������Ʈ
		
		setSize(640,480);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContentPaneEx frame=new ContentPaneEx();
		

	}

}
