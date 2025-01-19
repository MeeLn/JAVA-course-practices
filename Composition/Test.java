import Std.Address;
import Std.Student;
class Test{
	public static void main(String[] args){
		Address a = new Address("Lalitpur","bk",2);
		Student s = new Student("Abhay",1,a);
		System.out.println(s);
	}
}