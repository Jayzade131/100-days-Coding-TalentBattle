import java.util.Scanner;

//Day 46 coding Statement : Write Program to find sum of elements in an array
//
//Description
//
//Get an array as the input from the user and find the sum of the elements.
public class Test46 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int[] arr1= new int[n];
		System.out.println("enter the element of array");
		for (int i = 0; i < n; i++) {
			arr1[i]=sc.nextInt();
			
		}
		int sum=0;
		for (int i = 0; i < n; i++) {
			sum=sum+arr1[i];
			
		}
		System.out.println("sum :"+sum);
		}
		    

	}


