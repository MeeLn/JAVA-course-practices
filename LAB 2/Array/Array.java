import java.util.*;
class Array{
	static public int[] removeElement(int[] arr, int x){
			if(arr == null || x < 0 || x > arr.length){
				return arr;
			}
			int [] arr1 = new int[arr.length - 1];
			for(int i = 0, j = 0;i < arr.length;i++){
				if(x == i)
					continue;
				arr1[j] = arr[i];
				j++;
			}
			return arr1;
		}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0;i<arr.length;i++){
			System.out.print("Enter no. "+i+" Element: ");
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter postion to Delete array element: ");
		int x = scan.nextInt();
		arr = removeElement(arr,x);
		System.out.println(Arrays.toString(arr));
	}
}