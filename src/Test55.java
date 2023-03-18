import java.util.Arrays;
import java.util.Scanner;

//Day 55 coding Statement : Given 2 integer arrays X and Y of same size. Consider both arrays as vectors and print the sum of maximum scalar product (Dot product) of 2 vectors.

public class Test55 {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter the size of array :");
		 int n=sc.nextInt();
		 int[] arr=new int[n];
		 int[] arr1=new int[n];
		 System.out.println("enter the element of array 1 :");
		 for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		 System.out.println("enter the element of array 2 :");
		 for (int j = 0;j < n; j++) {
				arr1[j]=sc.nextInt();
			}
		 int sum=0;
		 Arrays.sort(arr);
		 Arrays.sort(arr1);
		 for (int i = 0; i < n; i++) {
			
		
				sum=sum+(arr[i]*arr1[i]);
			}
		 System.out.println("sum : "+sum);
		}
		
		 

	}


