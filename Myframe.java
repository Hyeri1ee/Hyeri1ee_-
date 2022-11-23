package trygui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//12주차 red,green,blue,pink 버튼 누르면 이에 따라 panel2의 색이 바뀜.
/*
 * GridLayout , addActionListener(버튼의 이벤트 처리)
 */
@SuppressWarnings("serial")
public class Myframe extends JFrame{

	String[] colorname = {"RED","GREEN","BLUE","PINK"};
	Color[] colors = {Color.RED,Color.GREEN,Color.BLUE,Color.PINK};
	Container c = getContentPane();
	JPanel jpanel1,jpanel2;
	
	Myframe(){
		setTitle("혜리의 아주 귀여운 프레임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		this.setLocationRelativeTo(null);
		setSize(500,500);
		setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/char1.png");
		this.setIconImage(img);
		
//		c.setBackground(Color.ORANGE);
//		c.setLayout(new FlowLayout()); 
		
		makepanel1();
		makepanel2();
	    
		
	}
	private void makepanel2() {
		// TODO Auto-generated method stub
		this.jpanel2 = new JPanel();
		this.jpanel2.setBackground(Color.GRAY);
		c.add(jpanel2,BorderLayout.CENTER);
	}
	private void makepanel1() {
		// TODO Auto-generated method stub
		
		//jpanel1 의 버튼
		this.jpanel1 = new JPanel();
		jpanel1.setLayout(new GridLayout(1,4,5,5));
		this.jpanel1.setBackground(Color.GRAY);
		
		for (int i =0;i < colorname.length;i++) {
			final int idx = i;
			JButton btn = new JButton(colorname[i]);
			//button 이벤트 처리
			btn.addActionListener(e -> jpanel2.setBackground(colors[idx])); 
			
			this.jpanel1.add(btn);
		}
		
		c.add(jpanel1,BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Myframe();
	}

}
