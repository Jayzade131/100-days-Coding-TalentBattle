/*Day 16 coding Statement : Write a program to identify if the number is Perfect number or not

Description

Get the input from the user and check whether that number is a perfect number or not.*/
import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int sum=0;
			System.out.println("enter the number");
			int num=sc.nextInt();
			
			for(int i=1;i<num;i++)
			{
				if(num%i==0)
				{
					
					sum=sum+i;
				}
			}
			
		if(sum==num){
			System.out.println("perfect number");
		}
		else{
			System.out.println("not perfect number");
		}
  
	}

}
