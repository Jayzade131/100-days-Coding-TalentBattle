import java.util.Scanner;

/* Day 30 coding Statement : Write a Program to print Length of the string without using strlen() function*/

public class Test30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string ");
		String str=sc.nextLine();
		int count=0;
		char str1[]=str.toCharArray();
		for (char c : str1) {
			count++;
		}
		System.out.println(count);
	}

}
