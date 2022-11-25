package checkBox;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

//JRadioButton 그룹 성질 구현
@SuppressWarnings("serial")
public class Check4 extends JFrame{
	Container c = getContentPane();
	JLabel la;
	
	Check4(String title){
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		c.setLayout(new FlowLayout());
		init();
		this.setSize(400,400);
		this.setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton grape = new JRadioButton("포도");
		JRadioButton pear = new JRadioButton("배");
		
		apple.addItemListener(new MyItemListener());
		grape.addItemListener(new MyItemListener());
		pear.addItemListener(new MyItemListener());
		
		g.add(apple);
		g.add(grape);
		g.add(pear);
		
		c.add(apple);
		c.add(grape);
		c.add(pear);
		
		c.add(la,BorderLayout.CENTER);
		
	}
	
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if (e.getItem().toString() == "apple")
				la.setText(e.getItem().toString());
			else if (e.getItem().toString() == "grape")
				la.setText(e.getItem().toString());
			else
				la.setText(e.getItem().toString());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Check4("202211354 이혜리");
	}

}
