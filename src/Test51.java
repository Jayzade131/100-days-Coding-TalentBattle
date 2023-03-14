import java.util.Arrays;
import java.util.Scanner;

//Day 51 coding Statement : Given an integer array of size N, write a program to sort the array;
public class Test51 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the element of array :");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println("Sort array :");
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
