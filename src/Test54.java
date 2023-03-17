import java.util.Scanner;

//Day 54 coding Statement : Given an integer array of size N. Write Program to find whether Arrays are disjoint or not. Two arrays are said to be disjoint if they have no elements in common.
public class Test54 {
	static boolean arrayDisjoint(int arr1[],int arr2[],int n1,int n2)
	{
		boolean cond=true;
		for (int i = 0; i < n1; i++) {
			
			for (int j = 0; j < n2; j++) {
				if(arr1[i]==arr2[j])
				{
					cond=false;
				}
			}
			if(cond==false)
			{
				break;
			}
		}
		return cond;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1st array");
		int n1=sc.nextInt();
		int[] arr1=new int[n1];
		System.out.println("enter the element of 1st array");
		for (int i = 0; i < n1; i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter the size of 2st array");
		int n2=sc.nextInt();
		int[] arr2=new int[n2];
		System.out.println("enter the element of 2st array");
		for (int i = 0; i < n2; i++) {
			arr2[i]=sc.nextInt();
		}
		
		if(arrayDisjoint(arr1, arr2, n1, n2)==true)
		{
			System.out.println("Disjoint");
		}
		else{
			System.out.println("Not Disjoint");
		}
	
			}
		
		
	}


