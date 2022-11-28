package lecture;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Mydialog extends JDialog {
	Container dialog = this.getContentPane();
	Test1 parent = null;
	boolean modal = true;
	
	JTextField tf;
	JButton ok;
	
	public Mydialog(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		//setLayout(new FlowLayout());
		this.parent = (Test1) parent;
		this.modal = modal;
		this.setSize(300,300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //창만 닫겠다.
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		tf = new JTextField(10);
		ok = new JButton("확인");
		ok.addActionListener(e->{
			if (!modal) {
				String str = tf.getText();
				if (str.length() > 0)
					parent.tf.setText(str);
				parent.dlg = null;
			}
			dispose(); //창 닫기
		
		});
		dialog.setLayout(new FlowLayout());
		dialog.add(tf);
		dialog.add(ok);
		this.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				if (!modal)
					parent.dlg = null;
				dispose();
			}
			
		});
		
	}



}
