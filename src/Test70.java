import java.util.Arrays;
import java.util.Scanner;

//Day 70 coding Statement : Given an array, rotate the array by one position in clock-wise direction.
public class Test70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("enter the element of array");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		 int x = arr[arr.length-1], i;
		 
	       for (i = arr.length-1; i > 0; i--){
	          arr[i] = arr[i-1];
	       
	       }
	       arr[0] = x;
		System.out.println("rotate array : "+Arrays.toString(arr));
		 
	}

}
