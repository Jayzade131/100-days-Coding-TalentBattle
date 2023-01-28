import java.util.Scanner;

/*Day 6 coding Statement:  Write a program to find the Quadrants in which coordinates lie

Get the value of x and y coordinates as input from the user and check in which quadrant the point lies and print it.
*/
 
public class Test6 {

	public static void main(String[] args) {
int x,y;		
Scanner sc=new Scanner(System.in);

System.out.print("enter the value of x = ");
x=Integer.parseInt(sc.nextLine());
System.out.print("enter the value of y = ");
y=Integer.parseInt(sc.nextLine());

if(x>0 && y>0)
{
	System.out.println("This point lies in first quadrant.");
}
else if(x<0 && y>0)
{
	System.out.println("This point lies in second quadrant.");	
}
else if(x<0 && y<0)
{
	System.out.println("This point lies in Third quadrant.");	
}
else{
	System.out.println("This point lies in fourth quadrant.");
}
	}

}
