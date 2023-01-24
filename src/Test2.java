/*Day 2 coding Statement : Write a program to identify if the character is an alphabet or not.

Description:

Take an input character from user and check whether it is an alphabet or not.*/

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any Alphabet");
		char val=sc.nextLine().charAt(0);
		
		if(val >='a' && val <='z' || val >='A' && val <='Z')
		{
			System.out.println("Alphabet");
		}
		else{
			System.out.println("Not an alphabet");
		}
	}

}
