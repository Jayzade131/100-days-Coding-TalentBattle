import java.util.Scanner;

//Day 48 coding Statement : Write Program to remove duplicate elements in an array
//
//Description
//
//Get an array as input from the user and then remove all the duplicate elements in that array.
public class Test48 {
	public static int removeEle(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}

		arr[j++] = arr[n - 1];
		return j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("enter the element of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int j = 0;
		j = removeEle(arr, n);
		

		for (int i = 0; i < j; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
