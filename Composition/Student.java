package Std;
public class Student{
	private String name;
	private int roll;
	private Address addr;
	public Student(String name, int roll, Address addr){
		this.name = name;
		this.roll = roll;
		this.addr = addr;
	}
	public String toString(){
		return "Name: "+this.name+" Roll No:"+this.roll+" Address:"+this.addr;
	}
}