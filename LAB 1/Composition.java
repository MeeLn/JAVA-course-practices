class Address{
	private String city,street;
	private int ward;
	public Address(String city, String street, int ward){
		this.city = city;
		this.street = street;
		this.ward = ward;
	}
	public String toString(){
		return "City:-"+this.city+"Street:-"+this.street+"Ward:-"+this.ward;
	}
}
class Student{
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
class Test{
	public static void main(String[] args){
		Address a = new Address("Lalitpur","bk",2);
		Student s = new Student("Abhay",1,a);
		System.out.println(s);
	}
}