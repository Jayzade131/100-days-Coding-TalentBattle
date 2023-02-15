import java.util.Scanner;

/*Day 24 coding Statement : Write a program to print Pyramid pattern using stars

Description

Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.*/

public class Test24 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
