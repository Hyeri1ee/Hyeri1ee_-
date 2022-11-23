package trygui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//예제 : 마우스 이벤트 리스너 작성 연습 / 마우스로 문자열 이동시키기
@SuppressWarnings("serial")
public class Myframe5 extends JFrame{

	Container c = this.getContentPane();
	JPanel p;
	
	
	public Myframe5(String title) {
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		init();
		this.setSize(500,500);
		this.setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		p = new JPanel();
		p.setLayout(null);
		p.setBackground(Color.YELLOW);
		
		JLabel la = new JLabel("hello~!");
		la.setSize(20,30);
		la.setLocation(40 , 40);
		
		p.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x,y);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});

		c.add(p);
		p.add(la);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Myframe5("혜리는 힘들어");
	}

}
