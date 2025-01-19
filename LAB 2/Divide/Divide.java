import java.util.*;
class Divide{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		try{
			int num,divider;
			System.out.print("Enter a number: ");
			num = scan.nextInt();
			System.out.print("Enter a Divider(Number that you want to divide with): ");
			divider = scan.nextInt();
			int result = num/divider;
			System.out.println("The result of "+num+" / "+divider+" is: "+result);
		}catch(InputMismatchException e){
			System.out.println("Enter only Integer!!");
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("End");
		}
	}
}