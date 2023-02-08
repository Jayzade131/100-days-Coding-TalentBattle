/*Day 17 coding Statement : Write a program to find the Factors of a number

Description

Get an input from the user and find the factors of the number.*/
import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}

	}

}
