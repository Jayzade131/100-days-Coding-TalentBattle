import java.util.Scanner;

//Day 40 coding Statement : Write a Program to Replace substring in a string
//
//Description
//
//Get a string as input from the user and then get another string which has to be removed from the string.
//
//Get the third input, the new substring which is placed in that substring position.
//
//Finally print the output by replacing the substring with new string.
public class Test40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str1 = sc.nextLine();
		System.out.println("enter the substring to be removed :");
		String str2 = sc.nextLine();

		String str3 = str1.replaceAll(str2, "");
		System.out.println("enter the new substring :");
		String str4 = sc.nextLine();
		System.out.println(str4 + str3);
	}

}
