/*Day 15 coding Statement : Write a program to identify if the number is Strong number or not

Description

Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.

E.g. let the number be 145

Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.*/

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=Integer.parseInt(sc.nextLine());
		int fact=1;
		int sum=0;
		int copy=num;
		
		if(num==0)
		{
			sum=sum+fact;
		}
		else{
			
			while(copy !=0)
			{
				fact=1;
				int rem=copy%10;
				for(int i=1;i<rem;i++)
				{
					fact =fact*i;
					sum=sum+fact;
					copy=copy/10;
					
				}
			}
		}
		if(sum==num)
		{
			System.out.println("strong number");
		}
		else{
			System.out.println("not a strong number");
		}
	}

}
