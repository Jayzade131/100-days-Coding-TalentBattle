import java.util.Scanner;

//Day 38 coding Statement : Write a Program to print Non-repeating characters in a string
//
//Description
//
//Get a string as the input from the user and print the non-repeating characters in a string.
public class Test38 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the String");
			String str=sc.nextLine();
			
			int freq[]=new int[256];
			for (int i = 0; i < str.length(); i++) {
				freq[str.charAt(i)]++;
			}
			
			System.out.println("non repeating Characters are:");
			
			for (int i = 0; i < 256; i++) {
				if(freq[i]==1)
				{
				System.out.print((char)i+"");	
				}
			}
			
			
	}

}
