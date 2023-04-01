import java.util.LinkedHashSet;
import java.util.Scanner;

//Day 68 coding Statement : you will be given queries. Each query is of one of the following three types: :
//
//Add an element to the set. :
//
//Delete an element from the set. (If the number is not present in the set, then do nothing). :
//
//If the number is present in the set, then print "Yes"(without quotes) else print "No"(without quotes).
//
//Input Format
//
//The first line of the input contains where is the number of queries. The next lines contain query each. Each query consists of two integers and where is the type of the query and is an integer.
//
//Constraints
//
// 
//
//Output Format
//
//For queries of type print "Yes"(without quotes) if the number is present in the set and if the number is not present, then print "No"(without quotes).
//
//Each query of type should be printed in a new line.
public class Test68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of element :");
		int t = sc.nextInt();
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		for (int i = 1; i <= t; i++) {
			System.out.println("enter the value of n :");
			int n = sc.nextInt();
			System.out.println("enter the element :");
			int a = sc.nextInt();

			if (n == 1) {
				hs.add(a);
			} else if (n == 2) {
				if (hs.contains(a)) {
					hs.remove(a);
				}
			} else if (n == 3) {
				if (hs.contains(a)) {
					System.out.println("yes");
				}

				else {
					System.out.println("no");
				}
			}
		}

	}

}
