/*Day 12 coding Statement:  Write a program to find Sum of digits of a number

Description

Get a number from user and then find the sum of the digits in the given number.
*/
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the number ");
		int num=sc.nextInt();
		
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		
System.out.println("sum of number is :"+sum);
	}

}
