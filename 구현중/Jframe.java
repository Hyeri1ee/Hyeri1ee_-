package e;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

@SuppressWarnings("serial")
public class Jframe extends JFrame{
	Container c = getContentPane();
	Jframe(String title){
		this.setTitle(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		createMenu();
		firstDefaultPage();
		this.setSize(500,500);
		this.setVisible(true);
	}

	public void firstDefaultPage() {
		// TODO Auto-generated method stub
		
	}

	public void createMenu() {
		// TODO Auto-generated method stub
		JMenuBar mb = new JMenuBar();
		JMenu menu1 = new JMenu("Plan");
		JMenu menu2 = new JMenu("Current");
		
		//.txt 파일에 있는 메뉴 아이템 읽어서 만드는 함수 입력 부분
		
		mb.add(menu1);
		mb.add(menu2);
		this.setJMenuBar(mb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jframe("22/23 p");
	}

}
