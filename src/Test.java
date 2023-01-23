/* 
 Day 1 coding Statement: Write a program to identify if the character is a vowel or consonant.

Description of the program: 


Take an input character from the user and check whether the given input is a vowel or consonant.
 */
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
       System.out.println("Enter the vowel");
       char val = sc.next().charAt(0);
       if(val >='a' && val <='z' || val >='A' && val <='B'  )
       {
    	  if(val =='a'|| val =='e'|| val =='i'|| val =='o'|| val =='u'|| val =='A'|| val =='E'|| val =='I'|| val =='O' || val == 'U' )
    	  {
    		  System.out.println("vowel");
    	  }
    	  else
    	  {
    		  System.out.println("Consonant");
    	  }
       }
       else{
    	   System.out.println("invalid input");
       }
       }
       
	
	}

