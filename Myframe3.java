package trygui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//12주차 강의자료 p.44 : 배치 관리자 없는 컨테이너 만들기.
@SuppressWarnings("serial")
public class Myframe3 extends JFrame{

	Container c = this.getContentPane();
	
	public Myframe3(String title) {
		setTitle(title);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		this.setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		JLabel la = new JLabel("hello professors, i'm buttons!");
		la.setLocation(130,50);
		la.setSize(200,20);
		
		c.add(la);
		
		for (int i = 0; i<=9;i++)
		{
			JButton btn = new JButton(Integer.toString(i));
			btn.setSize(50,20);
			btn.setLocation(i*20,i*20);
			
			c.add(btn);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Myframe3("배치 관리자 없는 버튼 겹쳐서 만들기");
	}

}
