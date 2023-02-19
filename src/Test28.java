import java.util.Scanner;

/*Day 28 coding Statement : Write a Program to reverse a string.

Description

Get an input string from user and print it in reverse order.*/
public class Test28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());

	}

}
