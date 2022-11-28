package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Test1 extends JFrame{
	Container c = getContentPane();
	JTextField tf;
	JButton btn1,btn2;
	Mydialog dlg = null;
	
	Test1(String title){
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		init();
		this.setSize(500,500);
		this.setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		this.tf = new JTextField(10);
		this.btn1 = new JButton("모달창");
		this.btn2 = new JButton("모달리스창");
		
		c.setLayout(new FlowLayout());
		c.add(tf);
		c.add(btn1);
		c.add(btn2);
		
		this.btn1.addActionListener(e->{
			Mydialog dig = new Mydialog(Test1.this,"모달창",true); //포커스 독점창
			String str = dig.tf.getText();
			
			if (str.length() > 0)
				tf.setText(str);
			else
				JOptionPane.showMessageDialog(null,"입력값 확인요함");
		});
//		btn1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		});
		
		this.btn2.addActionListener(e->{
			//창 개수 제어 부분
			if (dlg == null)
				dlg = new Mydialog(Test1.this,"모델리스창",false); //dlg 지역변수이면 안됨.
			else
				dlg.requestFocus();
//			String str = dlg.tf.getText();
//			
//			if (str.length() > 0)
//				tf.setText(str);
//			else
//				JOptionPane.showMessageDialog(null,"입력값 확인요함");
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1("202211354 이혜리");
	}

}
