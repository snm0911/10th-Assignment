import java.awt.*;
import javax.swing.*;
 
class MyFrame6 extends JFrame {
       public MyFrame6() {
 
             setTitle("FlowLayoutTest");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
             JPanel panel;
             // �г��� �����ϰ� ��ġ �����ڸ� FlowLayout���� ����
             panel = new JPanel();
             panel.setLayout(new FlowLayout(FlowLayout.CENTER));             
             // �гο� ��ư�� �����Ͽ� �߰�
             panel.add(new JButton("Button1"));
             panel.add(new JButton("Button2"));
             panel.add(new JButton("Button3"));
             panel.add(new JButton("B4"));
             panel.add(new JButton("Long Button5"));
             add(panel);
 
             pack();
             setVisible(true);
       }
}

public class Flowlayout {
	public static void main(String args[]) {
		MyFrame6 f = new MyFrame6();
	}
}
