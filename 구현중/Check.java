package checkBox;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Check extends JFrame{
	Container contentPane = getContentPane();
	ImageIcon cherryIcon = new ImageIcon("cherry/ch.png");
	ImageIcon cherryIcon2 = imageSetsize(cherryIcon, 25,25); 
	
	Check(String title){
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane.setLayout(new FlowLayout());
		init();
		this.setSize(500,500);
		this.setVisible(true);
		
	}
	private ImageIcon imageSetsize(ImageIcon icon, int i, int j) {
		Image ximg = icon.getImage();
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}
	private void init() {
		// TODO Auto-generated method stub
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배",true); //체크된 상태로
		JCheckBox cherry = new JCheckBox("체리",cherryIcon2,true);
		cherry.setBorderPainted(true); //외곽선 있도록
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Check("진심 재밌다 자바가");
	}

}
