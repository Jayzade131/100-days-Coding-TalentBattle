import java.util.Scanner;

//Day 41 coding Statement : Check if two strings match where one string contains wildcard characters
//
//Description
//
//Get two strings as input from the user, first with wildcard characters (* and ?) and second without wildcard characters.
//
//Then check whether they match or not.
public class Test41 {

	static boolean match(String first, String second) {
		if (first.length() == 0 && second.length() == 0) {
			return true;
		}

		if (first.length() > 1 && first.charAt(0) == '*') {
			int i = 0;
			while (i + 1 < first.length() && first.charAt(i + 1) == '*') {
				i++;
				first = first.substring(i);
			}
		}

		if (first.length() > 1 && first.charAt(0) == '*' && second.length() == 0) {
			return false;
		}
		if (((first.length() > 1 && first.charAt(0) == '?')
				|| (first.length() != 0 && second.length() != 0 && first.charAt(0) == second.charAt(0)))) {
			return match(first.substring(1), second.substring(1));
		}
		if (first.length() > 0 && first.charAt(0) == '*') {
			return match(first.substring(1), second) || match(first, second.substring(1));
		}

		return false;

	}

	static void test(String first, String second) {
		if (match(first, second)) {
			System.out.println("yes they match");
		} else {
			System.out.println("no they not match");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two string one with wildcard and other one with full String ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		test(str1, str2);

	}

}
