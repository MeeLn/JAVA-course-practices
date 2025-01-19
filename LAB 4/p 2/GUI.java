import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI extends JFrame implements ActionListener{
	JTextField t1,t2,t3;
	JButton b1,b2;
	
	public GUI(){
		setTitle("Title");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		b1 = new JButton("Add");
		b2 = new JButton("Sub");
		setSize(500,600);
		t1.setBounds(50,100,400,50);
		t2.setBounds(50,200,400,50);
		t3.setBounds(50,300,400,50);
		b1.setBounds(100,400,100,50);
		b2.setBounds(200,400,100,50);
		t3.setEditable(false);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	public static void main(String[] args){
		new GUI();
	}
	public void actionPerformed(ActionEvent e){
				int a = Integer.parseInt(t1.getText());
				int	b = Integer.parseInt(t2.getText());
				int r = 0;
				if(e.getSource() == b1){
					r = a+b;
				}else{
					r = a-b;
				}
				t3.setText(""+r);	
			}
}