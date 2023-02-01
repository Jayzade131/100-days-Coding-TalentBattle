/*Day 10 coding Statement:  Write a program to find Factorial of a number

Description

Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output. */
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=Integer.parseInt(sc.nextLine());
		int fac=1;
		for(int i=1;i<=num;i++)
		{
		fac=fac*i;	
		}
		System.out.println("factoiral = "+fac);
		}

}
