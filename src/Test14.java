/*Day 15 coding Statement : Write a program to identify if the number is Strong number or not

Description

Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.

E.g. let the number be 145

Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.*/
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