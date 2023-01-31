import java.util.Scanner;

/*Day 9 coding Statement : Write a program to find Number of digits in an integer

Description

Take an integer as the input from the user and then calculate the number of digits in the given input and print it as the output.
*/
public class Test9 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer ");
		n=Integer.parseInt(sc.nextLine());
		int count=0;
		do{
			n=n/10;
			count++;
		}while(n!=0);
System.out.println("count="+count);
	}

}
