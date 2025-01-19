package athelete;
abstract class Athelete{
	String name,country;
	public Athelete(String name, String country){
		this.name = name;
		this.country = country;
	}
	public void showStat(){}
}
public class Cricket extends Athelete{
	int runs;
	public Cricket(String name, String country, int runs){
		super(name,country);
		this.runs = runs;
	}
	public void showStat(){
		System.out.println("Name:"+this.name+" Country:"+this.country+" Runs:"+this.runs);
	}
}