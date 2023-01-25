/*
 Day 3 coding Statement: Write a program to find ASCII values of a character

Description:

Get an input character from the user and give the ASCII value of the given input as the output.
 */
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		char x;
		System.out.println("enter any character");
		x=sc.nextLine().charAt(0);
		
		int y= (int)x;
		
		System.out.println("ASCII values of a character"+x+" is = "+y);
		
		

	}

}
