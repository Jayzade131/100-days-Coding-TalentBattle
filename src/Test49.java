import java.util.Arrays;
import java.util.Scanner;

//Day 49 coding Statement : Given 2 integer arrays X and Y of same size. Consider both arrays as vectors and print the minimum scalar product (Dot product) of 2 vectors.
public class Test49 {
      public static void sort_des(int arr[],int n)
      {
    	  for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(arr[i]> arr[j])
				{
					int a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
      }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		System.out.println("enter the element of array 1 :");
		for (int i = 0; i < n; i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter the element of array 2 :");
		for (int i = 0; i < n; i++) {
			arr2[i]=sc.nextInt();
		}
		Arrays.sort(arr1);
		sort_des(arr2, n);
		
		int sum=0;
		for (int i = 0; i < n; i++) {
			sum=sum+(arr1[i]*arr2[i]);
			
		}
		System.out.println("sum :"+sum);
		
		
		

	}

}
