import java.util.Scanner;

/*Day 4 coding Statement:  Write a program to identify of the a number is positive or negative

Description

Get an input number from the user and check whether it is a positive or negative number.
*/
public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=Integer.parseInt(sc.nextLine());
		
		if(a>0)
		{
			System.out.println("postive number");
		}
		else if(a<0)
		{
			System.out.println("negative number");
		}
		else{
			System.out.println("Neither positive nor negative");
		}

	}

}
