import java.util.Scanner;

//Day 35 coding Statement : Write a Program to Count the sum of numbers in a string
//
//Description
//
//Get a string from the user and find the sum of numbers in the string.
public class Test35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int s1=0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i)))
			{
				s1=s1+Character.getNumericValue(str.charAt(i));
				
				
			}
		}
				System.out.println(s1);
	}

}
