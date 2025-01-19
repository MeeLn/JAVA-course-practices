import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Colors extends JFrame implements ActionListener{
	JTextField t1;
	JButton b1,b2,b3;
	
	public Colors(){
		setTitle("Title");
		b1 = new JButton("WHITE");
		b2 = new JButton("RED");
		b3 = new JButton("BLUE");
		setSize(500,600);
		b1.setBounds(50,200,100,50);
		b2.setBounds(150,200,100,50);
		b3.setBounds(250,200,100,50);
		add(b3);
		add(b1);
		add(b2);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	public static void main(String[] args){
		new Colors();
	}
	public void actionPerformed(ActionEvent e){
				if(e.getSource() == b1){
					getContentPane().setBackground(Color.WHITE);
				}else if(e.getSource() == b2){
					getContentPane().setBackground(Color.RED);
				}else{
					getContentPane().setBackground(Color.BLUE);
				}
			}
}