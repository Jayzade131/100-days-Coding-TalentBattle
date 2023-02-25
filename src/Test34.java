import java.util.Scanner;

//Day 34 coding Statement : Write a Program to Remove brackets from an algebraic expression
//
//Description
//
//Get an algebraic expression as input from the user and then remove all the brackets in that.
public class Test34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the expression");
		String str=sc.nextLine();
		String str2="";
				str2=str.replaceAll("[()]", "");
				System.out.println(str2);

	}

}
