import shape.Shape;
public class Test{
	public static void main(String[] args){
		Shape s = new Shape();
		Shape s1 = new Shape(6,4);
		Shape s2 = new Shape(20,30,5,10);
		System.out.println(s+"\n"+s1+"\n"+s2);
	}
}