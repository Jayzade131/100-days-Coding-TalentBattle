//Day 36 coding Statement : Write a Program to Capitalize the first and last letter of each word of a string
//
//Description
//
//Get a string from the user and then change the first and last letter to uppercase.
import java.util.Scanner;

public class Test36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		String newstr="";
		String str1[]=str.split("\\s");
		
		for (String s : str1) {
			
			String first=s.substring(0, 1);
			String rem=s.substring(1, s.length()-1);
			String last=Character.toString(s.charAt(s.length()-1));
			newstr=newstr+first.toUpperCase()+rem+last.toUpperCase()+"";
		}
		System.out.println(newstr);
		

	}

}
