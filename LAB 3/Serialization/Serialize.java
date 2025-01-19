import java.io.*;
class Student implements Serializable{
	String name;
	public Student(String name){
		this.name = name;
	}
	public void print(){
		System.out.print(this.name);
	}
}

class Serialize{
	public static void main(String[] args)throws IOException{
		Student s = new Student("Milan");
		FileOutputStream fos = new FileOutputStream("Sample.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(s);
		os.close();
		fos.close();
	}
}