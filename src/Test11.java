import java.util.Scanner;

/*Day 11 coding Statement:  Write a program to find Fibonacci series up to n

Description

Fibonacci series is a special series where nth term is the sum of previous two terms in the series. The series starts with 0 and 1 as the first and second term of the series respectively.

Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.*/
public class Test11 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=Integer.parseInt(sc.nextLine());
		int n1=0;
		int n2=1,n3;
		System.out.print(+n1+" , "+n2);
		for(int i=2;i<num;i++)
		{
			n3=n1+n2;
			System.out.print(" , "+n3);
			n1=n2;
			n2=n3;
		
		}

	}

}
