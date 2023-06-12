import java.util.HashSet;
import java.util.Scanner;

//Day 100 coding Statement : 
//
//You have prepared four problems. The difficulty levels of the problems are A1?,A2?,A3?,A4? respectively. A problem set comprises at least two problems and no two problems in a problem set should have the same difficulty level. A problem can belong to at most one problem set. Find the maximum number of problem sets you can create using the four problems.
//
//Input Format
//
//The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//The first and only line of each test case contains four space-separated integers A1?, A2?, A3?, A4?, denoting the difficulty level of four problems.
//Output Format
//
//For each test case, print a single line containing one integer - the maximum number of problem sets you can create using the four problems.
//
// 
public class Test100 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 for (int i = 0; i < t; i++) {
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=sc.nextInt();
		 int d=sc.nextInt();

		 HashSet<Integer> set=new HashSet<>();
		 set.add(a);
		 set.add(b);
		 set.add(c);
		 set.add(d);
		 if (set.size()==4)
		 System.out.println(2);
		 else if(set.size()==1)
		 System.out.println(0);
		 else if (set.size()==2) {
		 if ((a^b^c^d)==0)
		 System.out.println(2);
		 else
		 System.out.println(1);
		 }
		 else if (set.size()==3)
		 System.out.println(2);
		 }
		 }

}
