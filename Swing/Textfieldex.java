package text;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Textfieldex extends JFrame{
	Container c = getContentPane();
	Textfieldex(String title){
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 : "));
		c.add(new JTextField(20));
		c.add(new JLabel("학과 : "));
		c.add(new JTextField("컴퓨터공학과",20)); //컴퓨터공학과로 초기 출력되고,, 20 칸 열의 개수
		c.add(new JLabel("주소 : "));
		c.add(new JTextField("서울시...",20));
		c.add(new JTextArea("hello,7,7"));
		c.add(new JScrollPane(new JTextArea("hello!",7,20)));
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Textfieldex("pass");
	}

}
