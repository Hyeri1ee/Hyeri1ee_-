package e;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// Jslider 사용하여 글자 크기 조정하기
@SuppressWarnings("serial")
public class Jframe3 extends JFrame {
	Jframe3(){
		this.setTitle("Jslider 글자 크기 조정 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel la = new JLabel("i love java...");
		la.setHorizontalAlignment(JLabel.CENTER);
		la.setFont(new Font("궁서체",Font.ITALIC,50));
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,1,100,50);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider js = (JSlider) e.getSource();
				la.setFont(new Font("궁서체",Font.ITALIC,js.getValue()));
				
			}
			
		});
		
		this.add(slider,BorderLayout.NORTH);
		this.add(la,BorderLayout.CENTER);
		
		this.setSize(600,500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jframe3();
	}

}
