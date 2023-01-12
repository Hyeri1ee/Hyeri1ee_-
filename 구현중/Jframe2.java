package e;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

//JSlider 사용연습
@SuppressWarnings("serial")
public class Jframe2 extends JFrame{
	Container c = getContentPane();
	// slider 설정
	JSlider slider = new JSlider(JSlider.HORIZONTAL,0,100,25);
	// panel1 설정
	JPanel panel1 = new JPanel();
	
	Jframe2(String title){
		this.setTitle(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		init();
		this.setSize(500,500);
		this.setVisible(true);
	}
	public void init() {
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		panel1.add(slider);
		c.add(panel1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jframe2 a = new Jframe2("test page");
		a.pack();
		a.setVisible(true);
	}

}
