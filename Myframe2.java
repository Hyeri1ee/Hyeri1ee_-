package trygui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//cardlayout 활용하기
@SuppressWarnings("serial")
public class Myframe2 extends JFrame{

	Container c = this.getContentPane();
	JPanel panel1, panel2;
	Color[] colorname = {Color.RED,Color.ORANGE,Color.BLACK,Color.CYAN,Color.GRAY};
	
	CardLayout cl = new CardLayout();
	JPanel[] card;
	
	public Myframe2 (String title) {
		setTitle(title);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		this.setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		makepanel1();
		makepanel2();
	}
	private void makepanel1() {
		// TODO Auto-generated method stub
		panel1 = new JPanel(new GridLayout(1,3,20,20));
		JButton btn1 = new JButton("<<<");
		btn1.addActionListener(e->cl.previous(panel2)); 
		
		JButton btn2 = new JButton("COME BACK HOME");
		btn2.addActionListener(e->cl.show(panel2,"2")); //panel2에서 블랙 색 띄우기
		
		JButton btn3 = new JButton(">>>");
		btn3.addActionListener(e->cl.next(panel2)); 
		
		
		panel1.add(btn1);
		panel1.add(btn2);
		panel1.add(btn3);
		
		c.add(panel1, BorderLayout.NORTH);
	}
	private void makepanel2() {
		// TODO Auto-generated method stub
		panel2 = new JPanel(cl);
		this.card = new JPanel[colorname.length];
		for (int i =0;i<colorname.length;i++) {
			card[i] = new JPanel(); //flowlayout 배치 관리자 사용해서 붙이기
			card[i].setBackground(colorname[i]);
			panel2.add(card[i],String.valueOf(i));
		}
		cl.show(panel2, "3"); //초기값 0123 -> color.CYAN
		c.add(panel2,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Myframe2("혜리가 고생해서 만든 것");
	}

}
