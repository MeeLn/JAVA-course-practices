package over;
public class Integer{
	private String name;
	private int roll;
	public Integer(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
	public String toString(){
		return "Name: "+this.name+" Roll: "+this.roll;
	}
}