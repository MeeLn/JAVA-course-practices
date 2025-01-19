import java.util.Scanner;
import java.io.*;

class File{
	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		
		FileOutputStream fos = new FileOutputStream("sample.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		int c = 0;
		while(true){
			System.out.print("Enter Name:");
			String name = scan.nextLine();
			dos.writeUTF(name);
			
			System.out.print("Enter Roll:");
			int roll = scan.nextInt();
			dos.writeInt(roll);
			
			System.out.print("Enter Address:");
			String addr = scan.next();
			dos.writeUTF(addr);
			
			c++;
			
			System.out.print("Enter Y to exit:");
			String key = scan.next();
			if(key.toUpperCase().startsWith("Y")){
				break;
			}
		}
		System.out.print("No of Records: "+c);
		dos.close();
		fos.close();
	}
}