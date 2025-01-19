import java.io.*;
class Write{
	public static void main(String[] args){
		try{
			String A= "ABC";
			byte[] b = A.getBytes();
			FileOutputStream fos = new FileOutputStream("sample.txt");
			fos.write(b);
			fos.close();
		}catch(IOException e){
			System.out.print(e.getMessage());
		}
	}
}