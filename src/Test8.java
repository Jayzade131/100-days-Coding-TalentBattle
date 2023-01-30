/*
Write a program to find roots of a quadratic equation
Description
Get the values of a, b and c (coefficients of quadratic equation) as input from the user and calculate the
roots and print as the output. */
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c,d;
		System.out.println("enter the value of a, b, c");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=Math.pow(b, 2)-4*a*c;
		if(d>0)
		{
			System.out.println("there are two real roots");
			
			System.out.println("Roots are " + (-b+Math.sqrt(d))/(2*a) + " and " + (-b-Math.sqrt(d))/(2*a));
		 }
		
		 else if (d == 0){
		 System.out.println("Roots are equal");
		 
		 System.out.println("Roots are " + -b/(2*a));
		 }
		
		 else{
		 System.out.println("No real roots");
		 
		 System.out.println("Roots are " + -b/(2*a) + "+i" +Math.sqrt(-d)/(2*a) + " and "+ -b/(2*a) + "-i" + Math.sqrt(-d)/(2*a));
		 }
		 }
		}