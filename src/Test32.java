/*Day 32 coding Statement : Write a Program to Remove vowels from a string

Description

Get a string as the input from the user and then remove all the vowel letters from the string and give the output.
*/
import java.util.Scanner;

public class Test32 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    System.out.println("enter the String");
	    String str=sc.nextLine();
	   String s1="";
	   s1= str.replaceAll("[aeiou]", "");
	   System.out.println(s1);
	    }

	}


