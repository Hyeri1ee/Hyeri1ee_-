package trygui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//독립된 클래스로 이벤트 리스너를 작성
//익명 객체로 이벤트 리스너를 작성 **
@SuppressWarnings("serial")
public class Myframe4 extends JFrame{

	Container c = this.getContentPane();
	
	public Myframe4(String title) {
		super(title);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		this.setSize(500,500);
		this.setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("action");
		btn.addActionListener(new ActionListener() {//익명객체

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b = (JButton)e.getSource();
				if (b.getText().equals("action"))
					b.setText("액션~");
				else
					b.setText("action");
				//setTitle(b.getText());
			}
			
		});
		c.add(btn);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Myframe4("뒤질거같은데... 해야할 건 해야지");
	}

}


	

