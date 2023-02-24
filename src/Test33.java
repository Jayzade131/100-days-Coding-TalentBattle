import java.util.Scanner;

/*Day 33 coding Statement : Write a Program to check if String is a palindrome or not

Description

Get an input string from the user and then check whether it is a palindrome string or not.*/
public class Test33 {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=sc.nextLine();
		StringBuilder sb=new StringBuilder(s1);
		System.out.println(sb);
		StringBuilder sb2=new StringBuilder(sb.reverse());
		System.out.println(sb2);
		
		if(sb.equals(sb2))
		{
			System.out.println("It is palindrome string");
		}
		else{
			System.out.println("It is not palindrome string");
		}
	}

}
