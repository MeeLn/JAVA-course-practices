class StudentException extends Exception{
	public StudentException(String msg){
		super(msg);
	}
}
class Student{
	String name;
	int sem;
	public Student(String name, int sem)throws StudentException{
		if(sem < 1 || sem > 8){
			throw new StudentException("Only enter 1 - 8 for semesters!!");
		}
		this.name = name;
		this.sem = sem;
	}
	public String toString(){
		return "Name : "+this.name+" Semester : "+this.sem;
	}
}
class Test{
	public static void main(String[] args){
		try{
			Student s = new Student("Ram",0);
			System.out.print(s.toString());
		}catch(StudentException e){
			System.out.print(e.getMessage());
		}
	}
}