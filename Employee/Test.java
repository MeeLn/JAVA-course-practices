import java.util.Scanner;
import emp.Employee;
class Test{
	public static void main(String[] args){
		Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Name:");
		String n= sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter Salary:");
		int s= sc2.nextInt();
		Employee e = new Employee(n,s);
		System.out.println(e);
	}
}