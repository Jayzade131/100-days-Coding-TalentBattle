/*Day 14 coding Statement : Write a program to reverse a given number

Description

Get an input from the user and the print the reverse of the given number as the output*/
import java.util.Scanner;
public class Test14
{
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
 System.out.print("Enter a number: ");
 int num=sc.nextInt();
 int rev = 0;
 while(num!=0)
 {
 int rem=num%10;
 rev=rev*10+rem;
 num=num/10;
 }
 System.out.print(rev);
}
}