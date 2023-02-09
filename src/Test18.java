import java.util.Scanner;

/*Day 18 coding Statement : Write a program to Add two fractions

Description

Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format

x3/y3 = (x1/y1) + (x2/y2)

here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2) */

public class Test18 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x1 and y1");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		System.out.println("enter the value of x2 and y2");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		int x3=(x1*x2)+(x2*y1);
		int y3=(y1*y2);
		
		
		
		System.out.println(x3/y3);

	}

}
