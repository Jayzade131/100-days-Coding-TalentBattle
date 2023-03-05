import java.util.Arrays;
import java.util.Scanner;

//Day 42 coding Statement : Write Program to check if two arrays are the same or not
//
//Description
//
//Get two arrays as the input from the user and check whether it is the same or not.
public class Test42 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of first array");
		int n1 = sc.nextInt();
		System.out.println("enter the size of second array");
		int n2 = sc.nextInt();
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		System.out.println("enter the element of first array :");
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("enter the element of second array :");
		for (int j = 0; j < n2; j++) {
			arr2[j] = sc.nextInt();
		}

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("same");
		} else {
			System.out.println("not same.. ");
		}

	}

}
