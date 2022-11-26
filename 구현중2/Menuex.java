package text;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


//Day of 100 ! project
@SuppressWarnings("serial")
public class Menuex extends JFrame{
	
	String[] Cal = {"Aug","Sep","Oct","Nov","Dec"};
	String[] ImageNames = {"In-sa-dong","Cheonggyecheon","film-photo","Rooftop-Movie(Euljiro)","Namsan-Tower-Background","오빠☆"
			,"Top-Gun-Movie","mountain 승우","mountain 혜리","Chef Choi CseungWoo","Han River Date"};
	ImageIcon[] Images = {new ImageIcon("fimg/insadongimg.jpg"),
			new ImageIcon("fimg/chungaechun.jpg"),
			new ImageIcon("fimg/filmcamera.jpg"),   //여기까지 8월.
			new ImageIcon("fimg/rooftopmovie.jpg"),
			new ImageIcon("fimg/namsantower.jpg"),
			new ImageIcon("fimg/ghgh.jpg"),
			new ImageIcon("fimg/topgun.jpg"),
			new ImageIcon("fimg/mountain1.jpg"),
			new ImageIcon("fimg/mountain2.jpg"),
			new ImageIcon("fimg/deliciousglabi.jpg"), //여기까지 9월.
			new ImageIcon("fimg/hangang.jpg"),
			new ImageIcon("")}; 
	Container c = getContentPane();
	JPanel p = new JPanel(new FlowLayout());
	JLabel label = new JLabel();
	JLabel ImageLabel = new JLabel(); //초기화할 값 넣어야 함.
	
	
	Menuex(){
		setTitle("Day of 100 ! ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		
		BackgroundUI();
		
		p.setBackground(Color.pink);
		c.add(p);
		this.setSize(400,400);
		this.setVisible(true);
	}
	private void BackgroundUI() {
		// TODO Auto-generated method stub
		
		//메뉴 Cal 의 item 선택하면 p 의 배경 바꾸기
		menuinit();
		labelinit();
	}
	private void labelinit() {
		// TODO Auto-generated method stub
		label.setText(" 승우 ♥ 혜리 ");
		label.setFont(new Font("궁서체",Font.ITALIC,18));
	//	label.setBounds(20,20, 50, 360);
	    label.setHorizontalAlignment(JLabel.CENTER); //정 가운데에 label이 위치하도록
	    p.add(label);
	}
	private void menuinit() {
		// TODO Auto-generated method stub
		JMenuBar mb = new JMenuBar();
		
		JMenu menuCal = new JMenu("★Calendar★");
		for (String str : Cal) {
			JMenuItem item = new JMenuItem(str);
			item.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String menuCalSelected = e.getActionCommand();
					switch(menuCalSelected) {
					case "Aug": {p.setBackground(Color.CYAN);
					label.setForeground(Color.BLACK);
					AugustCheckBox();}break;
					case "Sep": {p.setBackground(Color.ORANGE);
					label.setForeground(Color.WHITE);}break;
					case "Oct": {p.setBackground(Color.WHITE);
					label.setForeground(Color.BLACK);}break;
					case "Nov": {p.setBackground(Color.LIGHT_GRAY);
					label.setForeground(Color.YELLOW);}break;
					case "Dec": {p.setBackground(Color.MAGENTA);
					label.setForeground(Color.WHITE);
					}break; //보라색 배경일 땐, label의 색도 바꾸어주기
					}
				}

				private void AugustCheckBox() {
					// TODO Auto-generated method stub
					
				}
				
			});
			menuCal.add(item);
		}
		mb.add(menuCal);
		p.add(mb);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Menuex();
	}

}
