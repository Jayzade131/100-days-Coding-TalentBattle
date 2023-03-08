import java.util.Scanner;

//Day 45 coding Statement : Write Program to find smallest and largest element in an array
//
//Description
//
//Get an array as input from the user and then find the smallest and largest element in the array.
public class Test45 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("enter the element of arrays");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		
		for(int i = 1; i < n; i++)
		{
			if( arr[i] > max )
			{
				max = arr[i];
			}
		}
		System.out.println("largest number :"+max);
		
		for(int i = 1; i < n; i++)
		{
			if( arr[i] < min )
			{
				min = arr[i];
			}
		}
		System.out.println("largest number :"+min);

	}

}
