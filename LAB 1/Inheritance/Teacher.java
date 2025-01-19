package emp;
class Employee{
	String name;
	int id , msal;
	public Employee(String name, int id, int msal){
		this.name = name;
		this.id = id;
		this.msal = msal;
	}
	public int getSalary(){
		return this.msal*12;
	}
	public String toString(){
		return "Name:"+this.name+" ID:"+this.id+" Monthly Salary:"+this.msal;
	}
}
public class Teacher extends Employee{
	int numSub;
	public Teacher(String name, int id, int msal, int numSub){
		super(name,id,msal);
		this.numSub = numSub;
	}
	public int getSalary(){
		return this.msal*12*numSub;
	}
	public String toString(){
		return "Name:"+this.name+" ID:"+this.id+" No. of Subs:"+this.numSub+" Monthly Salary:"+this.msal;
	}
}
