import java.util.Scanner;

//Day 82 coding Statement : 
//
//You are given N binary strings of length N each. You need to find a binary string of length N which is different from all of the given strings.
//
//Note:
//
//A binary string is defined as a string consisting only of '0' and '1'.
//A string is considered different from another string when they have different lengths, or when they differ in at least one position.
//Input Format
//
//The first line will contain T - the number of test cases. Then the test cases follow.
//The first line of each test case contains N - the number of strings and length of strings.
//Each of the next N lines contains a binary string of length N.
//Output Format
//
//For each test case, print on one line a binary string of length N, which is different from all of the given strings. If there are multiple possible answers, print any.
public class Test82 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the test case");
		int t = sc.nextInt();
		while (t-- > 0) {
			System.out.println("enter the length of string :");
			int n = sc.nextInt();
			System.out.println("enter the String");
			sc.nextLine();
			String ans = "";
			for (int i = 0; i < n; i++) {

				String s = sc.nextLine();
				if (s.charAt(i) == '0') {
					ans += "1";
				} else {
					ans += "0";
				}

			}
			System.out.println(ans);

		}

	}

}
