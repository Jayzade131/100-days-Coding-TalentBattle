import java.util.Scanner;

//Day 44 coding Statement : Write Program to find number of even and odd elements in an array
//
//Description
//
//Get an array as input from the user and then count the number of even and odd elements present in the array.
public class Test44 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.println("enter the element of arrays");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int od=0;
		int ev=0;
		for (int i = 0; i < n; i++) {
			if(arr[i]%2==1)
			{
				od++;
			}
			else{
				ev++;
			}
		}
		System.out.println("number of even numbers :"+ev);
		System.out.println("number of odd numbers :"+od);
		
		}
		
		

	}


