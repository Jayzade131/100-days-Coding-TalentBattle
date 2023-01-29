
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
		

	}

}
