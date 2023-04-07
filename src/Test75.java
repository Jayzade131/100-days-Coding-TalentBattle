import java.util.Iterator;
import java.util.Scanner;

//Day 75 coding Statement : 
//
//You are a person who is always fond of eating candies. Your friend gave you a candy of length N, to eat during the break period of your school.
//
//You start eating this candy from one of the ends. But as it is not your candy, your friend told you to eat exactly K unit length of candy during each bite. You will stop eating if the candy's length becomes 00. This means that you have eaten the entire candy.
//
//If at some point of time, the candy's length is positive, but less than K, you cannot take a bite thereafter.
//
//Can you eat the complete candy? If yes, print the number bites it will take, else print −1−1.
//
//Input Format
//
//First line will contain T, number of testcases. Then the testcases follow.
//Each testcase contains of two spaced integers N, K.
//Output Format
//
//For each testcase, print the minimum number of bites you need to eat the complete candy. Print −1−1 if it is not possible to do so.
public class Test75 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the testcase");
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("enter the length of candy");
			int n=sc.nextInt();
			System.out.println("enter the bite length");
			int k=sc.nextInt();
			
			if(n%k==0)
			{
				System.out.println(n/k);
			}
			else {
				System.out.println("-1");
			}
		}

	}

}
