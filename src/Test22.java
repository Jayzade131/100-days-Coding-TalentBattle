/*Day 23 coding Statement : Write a program to Replace all 0�s with 1 in a given integer
Description
Get a number as input from the user and find the zeros present in that number.*/
import java.util.Scanner;

public class Test22 {

	
	static int sumprimes(int n)
	{
	 int i, isPrime = 1;
	 for(i = 2; i <= n/2; ++i)
	 {
	 if(n % i == 0)
	 {
	 isPrime = 0;
	 break;
	 }
	 }
	 return isPrime;
	}
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = sc.nextInt();
	 int flag = 0;
	 for(int i = 2; i <= num/2; ++i)
	 {
	 if(sumprimes(i) == 1)
	 {
	 if(sumprimes(num-i) == 1)
	 {
	 System.out.println(num+" can be expressed as the sum of "+i+" and "+(num-i));

	 flag = 1;
	 }
	 }
	 }
	 if(flag == 0)
	 System.out.println(num+" cannot be expressed as the sum of two primes");
	}
	}


