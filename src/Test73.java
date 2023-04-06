import java.util.Scanner;

//Day 73 coding Statement : 
//
//A string is called boring if all the characters of the string are same.
//
//You are given a string S of length N, consisting of lowercase english alphabets. Find the length of the longest boring substring of S which occurs more than once.
//
//Note that if there is no boring substring which occurs more than once in S, the answer will be 00.
//
//A substring is obtained by deleting some (possibly zero) elements from the beginning of the string and some (possibly zero) elements from the end of the string.
//
//Input Format
//
//The first line of input will contain a single integer T, denoting the number of test cases.
//Each test case consists of two lines of input.
//The first line of each test case contains an integer N, denoting the length of string S.
//The next contains string S.
//Output Format
//
//For each test case, output on a new line, the length of the longest boring substring of S which occurs more than once.
public class Test73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the test case :");
		int t = sc.nextInt();
		int m = 0, currLen = 0, longest = 0;
		char lastChar;
		char[] c;
		int[] charCounter;
		while (t > 0) {
			System.out.println("enter the length of string :");
			int n = sc.nextInt();
			System.out.println("enter the String");
			c = sc.next().trim().toCharArray();
			charCounter = new int[30];
			longest = 0;
			lastChar = c[0];
			currLen = 1;

			for (int i = 0; i < c.length; i++) {
				if (c[i] == lastChar) {
					currLen++;
				} else {
					if (currLen >= charCounter[lastChar - 'a']) {
						if (currLen > longest) {
							if (currLen > charCounter[lastChar - 'a'] + 1) {
								longest = currLen - 1;
							} else {
								longest = charCounter[lastChar - 'a'];
							}
						}
						charCounter[lastChar - 'a'] = currLen;
					}
					lastChar = c[i];
					currLen = 1;
				}

				if (i == (c.length - 1) && currLen > longest) {
					if (currLen == c.length) {
						longest = currLen - 1;
					} else if (currLen >= charCounter[lastChar - 'a']) {
						if (currLen > charCounter[lastChar - 'a'] + 1) {
							longest = currLen - 1;
						} else {

							longest = charCounter[lastChar - 'a'];
						}
					}
				}
			}
			System.out.println(longest);
			n--;
		}

	}

}
