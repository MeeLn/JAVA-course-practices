import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI extends JFrame{
	JTextField t;
	JButton b;
	
	public GUI(){
		setTitle("Title");
		t = new JTextField();
		b = new JButton("OK");
		setSize(500,600);
		t.setBounds(50,100,400,50);
		b.setBounds(200,200,100,100);
		add(t);
		add(b);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s = t.getText();
				Font f = new Font("arial", Font.BOLD,20);
				t.setForeground(Color.BLUE);
				t.setText(s.toUpperCase());
			}
		});
		
	}
	public static void main(String[] args){
		new GUI();
	}
}