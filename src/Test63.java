import java.util.Scanner;

//Day 63 coding Statement : Balancing Weight
//
//No play and eating all day makes your belly fat. This happened to Manish during the lockdown. His weight before the lockdown was w1 kg (measured on the most accurate hospital machine) and after M months of lockdown, when he measured his weight at home (on a regular scale, which can be inaccurate), he got the result that his weight was w2 kg (w2>w1).
//
//Scientific research in all growing kids shows that their weights increase by a value between x1 and x2 kg (inclusive) per month, but not necessarily the same value each month. Manish assumes that he is a growing kid. Tell him whether his home scale could be giving correct results.
//
//Input
//
//The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows. The first and only line of each test case contains five space-separated integers w1, w2, x1, x2 and M.
//
//Output
//
//For each test case, print a single line containing the integer 1 if the result shown by the scale can be correct or 0 if it cannot.
public class Test63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of test cases");
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("enter weight before lockdown :");
			int w1 = sc.nextInt();
			System.out.println("enter weight during lockdown :");
			int w2 = sc.nextInt();
			System.out.println("enter weight increase by a value between x1 :");
			int x1 = sc.nextInt();
			System.out.println("enter weight increase by a value between x2 :");
			int x2 = sc.nextInt();
			System.out.println("enter the number of months weight increses during lockdown : ");
			int m = sc.nextInt();

			if ((w2 >= w1 + (x1 * m)) && (w2 <= w1 + (x2 * m)))
			{
				
				System.out.println("1");
			}
			else{
				System.out.println("0");
			}
		}

	}

}
