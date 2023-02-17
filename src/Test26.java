import java.util.Scanner;

/*Day 26 coding Statement : Write a program to calculate Maximum number of handshakes

Description

Get the number of people in the room as input from the user. Then calculate the maximum number of handshakes possible among that people.

For e.g. If there are N people in the room then the first person has to shake hand with N-1 people and second person has to shake hand with N-1-1 people i.e., N-2 handshakes are possible. Thus, it goes on.

So total hand shakes = N-1 + N-2 + N-3 +………+1 + 0 
*/
public class Test26 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of people");
		int n=sc.nextInt();
		int total=0;
		int N=0;
		for (int i = 1; i <=n; i++) {
			N=n-i;
			total=N+total;
			
		}
			System.out.println(total);	
	}

}
