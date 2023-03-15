import java.util.Scanner;

//Day 52 coding Statement : Given an integer array of size N, write a program to reverse the array;
public class Test52 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the element of array :");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Reverse array :");
		for (int i = n-1; i >=0; i--) {
			System.out.println(arr[i]);
		}

	}

}
