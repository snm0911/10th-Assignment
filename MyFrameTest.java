  import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame00 extends JFrame {
  
	public MyFrame00() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
  
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
  
		JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label1);
		JButton button1 = new JButton("�޺�����");
		JButton button2 = new JButton("������������");
		JButton button3 = new JButton("�Ұ�������");
		panel.setBackground(Color.BLUE);
		panelA.setBackground(Color.CYAN);
		panelB.setBackground(Color.GREEN);
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		JLabel label2 = new JLabel("����");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
  
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
  
	}
}

public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame00 f = new MyFrame00();
	}
}