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
class Teacher extends Employee{
	int numSub;
	public Teacher(String name, int id, int msal, int numSub){
		super(name,id,msal);
		this.numSub = numSub;
	}
	public int getSalary(){
		return super.getSalary()*numSub;
	}
	public String toString(){
		return super.toString+" No. of Subs:"+this.numSub;
	}
}
class Test{
	public static void main(String[] args){
		Teacher T = new Teacher("Ram",4312,40000,6);
		System.out.println(T);
		System.out.println("Total Salary:"+T.getSalary());
	}
}