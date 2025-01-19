package emp;
public class Employee{
	String name;
	int salary;
	public Employee(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	public String toString(){
		return "Name: "+this.name+" Salary: "+this.salary;
	}
}