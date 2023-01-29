/*
Day 7 coding Statement:  Write a program to find Number of days in a given month of a given year

Description

Get the number of month and year as input from the user and check the number of days present in that month.*/

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month");
		int m=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the year");
		int y=Integer.parseInt(sc.nextLine());
		
		if( ((m==2) && (y%400==0))  )
		{
			System.out.println("29 days");
		}
		 else if(m==2)
		{
			System.out.println("28 days");
		}
		 else if(m==4 || m==6 || m==9 || m==11)
		 {
			 System.out.println("30 days");
		 }
		 else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
		 {
			 System.out.println("31 days");
		 }
		 else{
			 System.out.println("invalid month");
		 }

	}

}
