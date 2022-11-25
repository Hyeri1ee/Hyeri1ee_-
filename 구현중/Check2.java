package checkBox;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//13주차 p.17
@SuppressWarnings("serial")
public class Check2 extends JFrame{
	Container c = getContentPane();
	JCheckBox[] fruits= new JCheckBox[3];
	String[] names = {"사과","배","체리"};
	JLabel sumLabel;
	int sum = 0;
	
	Check2(String title){
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		
		init();
		setSize(400,400);
		setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		for (int i =0; i<fruits.length;i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener());
		}
		
		sumLabel = new JLabel("현재 0 원 입니다.");
		c.add(sumLabel);
	}
	
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			int selected = 1;
			if (e.getStateChange() == ItemEvent.SELECTED)
				selected = 1;
			else
				selected = -1;
			if (e.getItem() == fruits[0])
				sum += selected * 100;
			else if(e.getItem() == fruits[1])
				sum += selected *500;
			else
				sum += selected* 20000;
			
			sumLabel.setText("현재"+sum+"원 입니다.");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Check2(" ? 은근 재밌음");
	}

}
