import java.awt.*;

class GUI{
	Frame f;
	TextField t;
	Button b;
	
	public GUI(){
		f = new Frame("Title");
		t = new TextField();
		b = new Button("Click");
		f.setSize(500,600);
		t.setBounds(50,100,400,50);
		b.setBounds(200,200,50,50);
		f.add(t);f.add(b);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new GUI();
	}
}