package text;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//텍스트 필드에 입력한 문자열을
//텍스트 에어리어에 옮겨 추가하는 프로그램
@SuppressWarnings("serial")
public class Textareaex2 extends JFrame{
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7,20);
	Container c = getContentPane();
	
	Textareaex2(String title){
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		init();
		this.setSize(300,300);
		this.setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		c.setLayout(new FlowLayout());
		c.add(new JLabel("이력 후 <Enter> 키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextField t= (JTextField)e.getSource();
				ta.append(t.getText()+"\n");
				t.setText("");
			}
			
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Textareaex2("텍스트 필드 문자열 추가 예제");
	}

}
