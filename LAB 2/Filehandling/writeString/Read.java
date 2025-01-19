import java.io.*;
class Read{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("sample.txt");
			int i;
			while((i = fis.read()) != -1){
				System.out.print((char)i);
			}
			fis.close();
		}catch(FileNotFoundException e){
			System.out.print(e.getMessage());
		}catch(IOException e){
			System.out.print(e.getMessage());
		}
	}
}