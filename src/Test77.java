import java.util.Arrays;
import java.util.Scanner;

//Day 77 coding Statement : 
//
//You are given an array A of N elements. For any ordered triplet (i,j,k) such that i, j, and k are pairwise distinct and 1≤i,j,k≤N, the value of this triplet is (Ai?−Aj?)⋅Ak?. You need to find the maximum value among all possible ordered triplets.
//
//Note: Two ordered triplets (a,b,c) and (d,e,f) are only equal when a=d and b=e and c=f. As an example, (1,2,3) and (2,3,1) are two different ordered triplets.
//
//Input Format
//
//The first line of the input contains a single integer T - the number of test cases. The test cases then follow.
//The first line of each test case contains an integer N.
//The second line of each test case contains N space-separated integers A1?,A2?,…,AN?.
//Output Format
//
//For each test case, output the maximum value among all different ordered triplets.
public class Test77 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the testcase:");
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String s = sc.nextLine();
			String sr[] = s.split(" ");
			int ar[] = new int[n];
			for (int i = 0; i < n; i++)
				ar[i] = Integer.parseInt(sr[i]);
			Arrays.sort(ar);
			long cout = Integer.MIN_VALUE;
			cout = (long) (ar[n - 1] - ar[0]) * ar[n - 2];
			System.out.println(cout);
		}

	}

}
