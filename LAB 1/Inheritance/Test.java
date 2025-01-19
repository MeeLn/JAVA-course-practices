import emp.Teacher;
class Test{
	public static void main(String[] args){
		Teacher T = new Teacher("Ram",4312,40000,6);
		System.out.println(T);
		System.out.println("Total Salary:"+T.getSalary());
	}
}