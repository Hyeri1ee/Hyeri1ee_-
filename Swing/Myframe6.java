package trygui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Myframe6 extends JFrame{

	Container c = this.getContentPane();
	JPanel p;
	
	public Myframe6(String title) {
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
		p.setBackground(Color.PINK);
		
		this.addWindowListener(new MyyWindowListener(this));
		
		c.add(p,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Myframe6("202211354 이혜리");
	}

}

class MyyWindowListener implements WindowListener{

	Myframe6 frame;
	public MyyWindowListener(Myframe6 f) {
		this.frame = f;
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		if (frame != null) {
			String name = JOptionPane.showInputDialog("닉네임을 입력해 주세요");
			frame.setTitle(name + "님 환영합니다.");
		}
		//JOptionPane.showMessageDialog(null, "환영합니다.");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
