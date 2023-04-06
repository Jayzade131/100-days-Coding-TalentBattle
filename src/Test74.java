import java.util.Scanner;

//Day 74 coding Statement : 
//
//You have a grid with N rows and M columns. You have two types of tiles — one of dimensions 2×2 and the other of dimensions 1×1. You want to cover the grid using these two types of tiles in such a way that:
//
//Each cell of the grid is covered by exactly one tile; and
//The number of 1×1 tiles used is minimized.
//Find the minimum number of 1×1 tiles you have to use to fill the grid.
//
//Input Format
//
//The first line of input will contain a single integer T, denoting the number of test cases.
//Each test case consists of a single line containing two space-separated integers N,M.
//Output Format
//
//For each test case, print on a new line the minimum number of 1×1 tiles needed to fill the grid.
public class Test74 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("test case");
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("enter the rows");
			int n=sc.nextInt();
			System.out.println("enter the cols");
			int m=sc.nextInt();
			if(n%2==0 && m%2==0)
			{
				System.out.println("0");
				
			}
			else if(n%2==0 && m%2!=0) {
				System.out.println(n);
			}
			else if(n%2!=0 && m%2==0) {
				System.out.println(m );
			}
			else {
				System.out.println(m+n-1 );
			}
		}
	}

}
