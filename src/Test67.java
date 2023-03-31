import java.util.Scanner;

//Day 67 coding Statement : Bricks Breaking
//
//For her next karate demonstration, Arunima will break some bricks.
//
//Arunima stacked three bricks on top of each other. Initially, their widths (from top to bottom) are W1,W2,W3.
//
//Arunima strength is S. Whenever she hits a stack of bricks, consider the largest k≥0 such that the sum of widths of the topmost k bricks does not exceed S; the topmost k bricks break and are removed from the stack. Before each hit, Arunima may also decide to reverse the current stack of bricks, with no cost.
//
//Find the minimum number of hits Arunima needs in order to break all bricks if she performs the reversals optimally. You are not required to minimize the number of reversals.
//
//Input
//
//The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//
//The first and only line of each test case contains four space-separated integers S, W1, W2 and W3.
//
//Output
//
//For each test case, print a single line containing one integer ? the minimum required number of hits.
public class Test67 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the test case :");
	int t=sc.nextInt();
	while(t-->0)
	{
		System.out.println("enter the strength");
		int s=sc.nextInt();
		System.out.println("enter the weights w1,w2,w3 :");
		int w1=sc.nextInt();
		int w2=sc.nextInt();
		int w3=sc.nextInt();
		
		if((w1+w2+w3)<= s)
		{
			System.out.println("1");
		}
		else if((w1+w2)<= s)
		{
			System.out.println("2");
		}
		else if((w2+w3)<= s)
		{
			System.out.println("2");
		}
		else{
			System.out.println("3");
		}
		

	}

	}

}
