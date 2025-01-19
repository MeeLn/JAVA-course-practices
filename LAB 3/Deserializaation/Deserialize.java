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

class Deserialize{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("Sample.txt");
			ObjectInputStream os = new ObjectInputStream(fis);
			Student s = (Student)os.readObject();
			s.print();
			os.close();
			fis.close();
		}catch(ClassNotFoundException e){
			System.out.print(e.getMessage());
		}
		catch(FileNotFoundException e){
			System.out.print(e.getMessage());
		}
		catch(IOException e){
			System.out.print(e.getMessage());
		}
	}
}