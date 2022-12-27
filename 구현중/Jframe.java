package e;

import java.awt.Container;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Jframe extends JFrame{
	Container c = getContentPane();
	Jframe(String title){
		this.setTitle(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		init();
		this.setSize(500,500);
		this.setVisible(true);
	}
	public void init() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jframe("22/23 p");
	}

}
