/*Day 19 coding Statement : Write a program to identify if the number is Armstrong number or not

Description

Get an input number from user and check whether the given number is an Armstrong number or not.

E.g. Let the number be 1634,

Here 1^4 + 6^4 + 3 ^4 + 4^4 = 1634

Therefore, this is an Armstrong number
*/

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt(); 
		 int copy = num;
		 int result=0;
		 int n=0;
		 int rem;
		 while (num != 0)
		 {
		 num /= 10;
		 n++;
		 }
		 num = copy; 
		 while (num != 0) 
		 {
		 rem = num%10;
		 int mul=1;
		 for(int i=1;i<=n;i++) {
		 mul=mul*rem; 
		 } 
		 result=result+mul;
		 num /= 10; 
		 }
		 if(result==copy)
		
		 System.out.println("Armstrong Number");
		 else
		 System.out.println("Not Armstrong number");


	}

}
