package pkg;
class Employee{
	String name;
	int id,msal;
	public Employee(String name, int id, int msal){
		this.name = name;
		this.id = id;
		this.msal = msal;
	}
	public int getYsalary(){
		return this.msal*12;
	}
	public String getDetail(){
		return "Name: "+this.name+" Salary: "+this.getYsalary();
	}
}
public class Teacher extends Employee{
	int numSub;
	public Teacher(String name, int id, int msal, int numSub){
		super(name,id,msal);
		this.numSub = numSub;
	}
	public int getYsalary(){
		return this.msal*12*this.numSub*2000;
	}
	public String getDetail(){
		return super.getDetail()+" No. of Subject: "+this.numSub;
	}
}