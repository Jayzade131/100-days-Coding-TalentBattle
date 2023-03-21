import java.util.Scanner;

//Day 58 coding Statement : Bucket Filling
//
//Nejiya has a bucket having a capacity of K liters. It is already filled with X liters of water.
//
//Find the maximum amount of extra water in liters that Nejiya can fill in the bucket without overflowing.
//
//Input Format
//
//The first line will contain T - the number of test cases. Then the test cases follow.
//
//The first and only line of each test case contains two space separated integers K and X - as mentioned in the problem.
//
//Output Format
//
//For each test case, output in a single line, the amount of extra water in liters that Nejiya can fill in the bucket without overflowing.
public class Test58 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of test cases :");
		int t=sc.nextInt();
		int[] k=new int[t];
		int[] x=new int[t];
		
		
		
		for (int i = 0; i < t; i++) {
			System.out.println("enter the capacity of bucket :");
			k[i]=sc.nextInt();
			System.out.println("enter the already filled water in bucket :");
			x[i]=sc.nextInt();
			
		}
		int[] ans=new int[t];
		for (int i = 0; i < t; i++) {
			ans[i]=k[i]-x[i];
			System.out.println("the amount of extra water : "+ans[i]);
			
			
		}
		
		
		

	}

}
