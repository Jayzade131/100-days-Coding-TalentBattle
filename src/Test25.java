import java.util.Scanner;

/*Day 25 coding Statement : Write a program to find Area of a circle

Description

Get the value for radius from the user and calculate the area of the circle for the given radius.*/
public class Test25 {

	public static void main(String[] args) {
		
		double r;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of radius");
		r=sc.nextDouble();
		double area=3.14*r*r;
		System.out.println("area of circle = "+area);

	}

}
