import java.util.Scanner;

//Day 60 coding Statement : Good Weather
//
//The weather report of Magicland is Good if the number of sunny days in a week is strictly greater than the number of rainy days.
//
//Given 7 integers A1,A2,A3,A4,A5,A6,A7 where Ai=1 denotes that the ith day of week in Magicland is a sunny day, Ai=0 denotes that the ith day in Magicland is a rainy day. Determine if the weather report of Magicland is Good or not.
//
//Input Format
//
//First line will contain T, number of testcases. Then the testcases follow.
//
//Each testcase contains of a single line of input, 7 space separated integers A1,A2,A3,A4,A5,A6,A7.
//
//Output Format
//
//For each testcase, print "YES" if the weather report of Magicland is Good, otherwise print "NO". Print the output without quotes.
//
//You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).
public class Test60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Test case :");
		int t = sc.nextInt();
		System.out.println("enter the weather input has 1 has sunny and 0 has rainy :");
		for (int i = 0; i < t; i++) {
			int sum0 = 0;
			int sum1 = 0;
			for (int j = 0; j < 7; j++) {

				int k = sc.nextInt();

				if (k == 1) {
					sum1++;
				} else {
					sum0++;
				}
			}
			if (sum1 > sum0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");

			}
		}

	}

}
