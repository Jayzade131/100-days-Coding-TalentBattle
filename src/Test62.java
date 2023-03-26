import java.util.Scanner;

//Day 62 coding Statement : Gold Mining
//
//Anusree has decided to go to a gold mine along with N of his friends (thus, total N+1 people including Anusree go to the gold mine).
//
//The gold mine contains a total of X kg of gold. Every person has the capacity of carrying up atmost Y kg of gold.
//
//Will Anusree and his friends together be able to carry up all the gold from the gold mine assuming that they can go to the mine exactly once.
//
//Input Format
//
//First line will contain T, number of testcases. Then the testcases follow. Each testcase contains of a single line of input, three integers N, X, Y.
//
//Output Format
//
//For each testcase, output "YES" if you and your friends can carry all the gold, otherwise output "NO".
//
//You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).
public class Test62 {
	static boolean  gold(int n,int x,int y)
	{
		return n*y>=x;
		
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the test cases :");
	int t=sc.nextInt();
	for (int i = 0; i < t; i++) {
		System.out.println("enter the number of frds anshree have :");
		int n=sc.nextInt();
		n=n+1;
		System.out.println("enter the gold mine contains a total of  gold in kg");
		int x=sc.nextInt();
		System.out.println("enter the capicity of every person :");
		int y=sc.nextInt();
		if(gold(n, x, y))
		{
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

	}

}
