import java.util.Scanner;

/*Day 29 coding Statement : Write a Program to concatenate a string.

Description

Get two strings as input from the user and then concatenate it.*/
public class Test29 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first String");
		String str1=sc.nextLine();
		
		System.out.println("enter the second String");
		String str2=sc.nextLine();
		
		System.out.println(str1+str2);
	}

}
