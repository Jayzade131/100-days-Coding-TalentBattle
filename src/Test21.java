import java.util.Scanner;

/*Day 21 coding Statement : Write a program to identify if the number is Palindrome or not

Description

Get a number as input from the user and check whether that number is a Palindrome or not.*/
public class Test21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int original = num;
		int reminder, reverse = 0;
		while (num != 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num /= 10;

		}

		if (original == reverse) {
			System.out.println("it is Palindrome");
		} else {
			System.out.println("it is not Palindrome");
		}
	}

}
