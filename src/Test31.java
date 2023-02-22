import java.util.Scanner;

/*Day 31 coding Statement : Write a Program to Toggle each character in a string

Description

Get an input string from user and then convert the lower case of alphabets to upper case and all upper-case alphabets into lower case.
*/

public class Test31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the String in both upper and lower case character");
		String str=sc.nextLine();
		String s1="";
		for (int i = 0; i < str.length(); i++) {
		
			 if(Character.isLowerCase(str.charAt(i)))
			 {
				 s1=s1+Character.toUpperCase(str.charAt(i));
			 }
			 else
			 {
				 s1=s1+Character.toLowerCase(str.charAt(i));
			 }
			
	}
		 System.out.println("Toggle String is = "+s1);
}
}