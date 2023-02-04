import java.util.Scanner;

/*Day 13 coding Statement:  Write a program to find Sum of N natural numbers

Description

Get the input from the user for the value of n and then find the sum of first n natural numbers.*/
public class Test13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("sum :"+sum);
	}

}
