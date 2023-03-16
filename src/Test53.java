import java.util.Scanner;

//Day 53 coding Statement : Given an integer array of size N. Write Program to find maximum product subarray in a given array.
public class Test53 {
	static int maxSubArrayProduct(int arr[],int n)
	{
		int result=arr[0];
		for (int i = 0; i < n; i++) {
			int mul=arr[i];
			
			for (int j = i+1; j < n; j++) {
				result=Math.max(result, mul);
				mul *=arr[j];
			}
			result=Math.max(result, mul);
		}
		return result;
		
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array :");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("enter the element ");
	for (int i = 0; i < n; i++) {
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Maximum subarray product :"+maxSubArrayProduct(arr,n));
	
	
	

	}

}
