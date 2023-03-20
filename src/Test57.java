import java.util.Scanner;

//Day 57 coding Statement :
//
//"Pass or Fail
//
//Anusree is struggling to pass a certain college course.
//The test has a total of N question, each question carries 3 marks for a correct answer and −1 for an incorrect answer. Anusree is a risk-averse person so he decided to attempt all the questions. It is known that Anusree got X questions correct and the rest of them incorrect. For Anusree to pass the course he must score at least P marks.
//Will Anusree be able to pass the exam or not?
//Input Format
//First line will contain T, number of testcases. Then the testcases follow.
//Each testcase contains of a single line of input, three integers N, X, P.
//Output Format
//For each test case output ""PASS"" if Chef passes the exam and ""FAIL"" if Chef fails the exam.
//You may print each character of the string in uppercase or lowercase (for example, the strings ""pAas"", ""pass"", ""Pass"" and ""PASS"" will all be treated as identical).
public class Test57 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the test cases :");
		int t=sc.nextInt();
		int[] n =new int[t];
		int[] x =new int[t];
		int[] p =new int[t];
		System.out.println(" 1 .enter total question :");
		System.out.println(" 2 .enter the number of correct answer :");
		System.out.println(" 3 .enter the marks wants to pass the test :");
		for (int i = 0; i < t; i++) {
			n[i]=sc.nextInt();
			x[i]=sc.nextInt();
			p[i]=sc.nextInt();
		}
		
		for (int i = 0; i < t; i++) {
			
			if((x[i]*3)>=p[i])
			{
				System.out.println("PASS");
			}
			else{
				System.out.println("FAIL");
				
			}
		}
		

	}

}
