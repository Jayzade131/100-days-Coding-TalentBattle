import java.util.Arrays;
import java.util.Scanner;

//Day 39 coding Statement : Write a Program to check if two strings are Anagram or not
//
//Description
//
//Get two strings as input from the user and check whether it is Anagram or not.
public class Test39 {
	public  static boolean isAnagram(String s1,String s2){
    	   boolean stat=true;
    	   String str1=s1.replaceAll("[\\s] ", "");
    	   String str2=s2.replaceAll("[\\s] ", "");
    	   if(str1.length()!=str2.length())
    	   {
    		   stat=false;
    	   }
    	   else{
    		   	char[] arr1=str1.toLowerCase().toCharArray();
    		   	char[] arr2=str2.toLowerCase().toCharArray();
    		   	Arrays.sort(arr1);
    		   Arrays.sort(arr2);
    		   stat=Arrays.equals(arr1,arr2);
    		   
    	   }
    	   
		return stat;
    	   
    	   
       }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two string");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		boolean stat=isAnagram(s1, s2);
		if(stat)
		{
			System.out.println("it is Anagram");
		}	
		else{
			System.out.println("it is not Anagram");

		}
	}

}
