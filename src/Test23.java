import java.util.Scanner;

/*Day 23 coding Statement : Write a program to Replace all 0’s with 1 in a given integer

Description

Get a number as input from the user and find the zeros present in that number.

Then convert the zeros into one and then print it*/

public class Test23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int newnum=0;
		if(num == 0)
		 newnum=1;
		 while(num>0)
		 {
		 int rem = num%10;
		 if(rem == 0)
		 rem = 1;
		 num = num/10;
		 newnum=newnum*10+rem;
		 }
		 num = 0 ;
		 while(newnum>0)
		 {
		 int r = newnum%10;
		 num= num*10 + r;
		 newnum =newnum / 10;
		 }
		 System.out.println("New number is: "+num);

		 }

}
