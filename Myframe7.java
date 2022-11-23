package trygui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

//WindowAdapter 클래스 - sorce overriding
public class Myframe7 extends WindowAdapter {
	Myframe6 frame;
	public Myframe7(Myframe6 f) {
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

}
