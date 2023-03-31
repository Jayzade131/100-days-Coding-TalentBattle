import java.util.Scanner;

//Day 65 coding Statement : New Tablet
//
//Ajinkya decided to buy a new tablet. His budget is B, so he cannot buy a tablet whose price is greater than B. Other than that, he only has one criterion — the area of the tablet's screen should be as large as possible. Of course, the screen of a tablet is always a rectangle.
//
//Ajinkya has visited some tablet shops and listed all of his options. In total, there are N available tablets, numbered 1 through N. For each valid i, the i-th tablet has width Wi, height Hi and price Pi.
//
//Help Ajinkya choose a tablet which he should buy and find the area of such a tablet's screen, or determine that he cannot buy any tablet.
//
//Input
//
//The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//
//The first line of each test case contains two space-separated integers N and B. N lines follow.
//
//For each i (1≤i≤N), the i-th of these lines contains three space-separated integers Wi, Hi and Pi.
//
//Output
//
//For each test case, print a single line. If Ajinkya cannot buy any tablet, it should contain the string "no tablet" (without quotes).
//
//Otherwise, it should contain a single integer — the maximum area of the screen of a tablet Ajinkya can buy.
public class Test65 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of Test case");
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
			
		System.out.println("enter the number of tablet and budget :");
		int n=sc.nextInt();
		int b=sc.nextInt();
		int size=0;
		for (int j = 0; j < n; j++) {
			System.out.println("enter the width , height and price of tablet :");
			int wi=sc.nextInt();
			int hi=sc.nextInt();
			int pi=sc.nextInt();
			
			if(pi<=b)
			{	if(wi*hi>size){
				size=wi*hi;
			}
			}
		}
		if(size!=0)
		{
			System.out.println("size of  tablet : "+size);
		}
		else{
			System.out.println("no tablet");
		}
		
			
		}

	}

}
