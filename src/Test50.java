import java.util.Scanner;

//Day 50 coding Statement : Given an integer array of size N. Write Program to find sum of positive square elements in the array.
public class Test50 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the element of array");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for (int i = 0; i < n; i++) {
			int a=arr[i];
			sum=sum+(arr[i]*arr[i]);
			
		}
		System.out.println("sum : "+sum);

	}

}
