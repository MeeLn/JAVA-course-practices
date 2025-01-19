package inter;
interface p1{
	public void print();
}
public class Child implements p1{
	public void print(){
		System.out.println("Output");
	}
}