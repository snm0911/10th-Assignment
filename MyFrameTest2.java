import java.awt.FlowLayout;
import javax.swing.*;
  
class MyFrame2 extends JFrame {
	JPanel p1;
  
	public MyFrame2() {
		setSize(300, 200);
		setTitle("My Frame");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		for (int i = 0; i < 10; i++)
			p1.add(new JButton("Button" + i));
		add(p1);
		setVisible(true); // �������� ȭ�鿡 ǥ���Ѵ�.
	}
}

public class MyFrameTest2 {
	public static void main(String args[]) {
		MyFrame2 f = new MyFrame2();
	}
}
