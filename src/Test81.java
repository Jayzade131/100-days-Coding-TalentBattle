import java.util.Iterator;
import java.util.Scanner;

//Day 81 coding Statement : 
//
//You have a binary string S of length N. In one operation you can select a substring of S and reverse it. For example, on reversing the substring [2,4]S[2,4] for S=11000, we change 11000→10010.
//
//Find the minimum number of operations required to sort this binary string.
//It can be proven that the string can always be sorted using the above operation finite number of times.
//
//Input Format
//
//The first line of input will contain a single integer T, denoting the number of test cases.
//Each test case consists of 22 lines of input.
//The first line of each test case contains a single integer N — the length of the binary string.
//The second line of each test case contains a binary string S of length N.
//Output Format
//
//For each test case, output on a new line — the minimum number of operations required to sort the binary string.
public class Test81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the test case");
		int t = sc.nextInt();
		while (t-- > 0) {
			System.out.println("enter the length");
			int leng = sc.nextInt();
			System.out.println("string");
			String st = sc.nextLine();
			int count = 0;
			for (int j = st.length(); j >= 2; j--) {
				if (st.substring(j -2, j).equals("10")) {
					count++;
				}
			}
			System.out.println(count);

		}

	}

}
