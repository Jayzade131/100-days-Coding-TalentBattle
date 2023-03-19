import java.util.Scanner;

//Day 56 coding Statement : Write Program to find whether the numbers of an array be made equal
//
//Description
//
//Check whether the numbers of array be made equal or not
//
//For eg, for the following input it should print yes because
//
//50*2*3 , 75*2*2 and 150*2 are equal to 300 in all cases. So array numbers can be made equal
public class Test56 {
	static boolean convert(int a1[] ,int n)
	{
		for (int i = 0; i < n; i++) {
			while(a1[i] %2 ==0)
			{
				a1[i] /=2;
			}
			while (a1[i] %3==0) {
				a1[i] /=3;
			}
			
			
		}
		for (int i = 1; i < n; i++)
			if (a1[i] != a1[0])
			{
			return false;
			}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the element");
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
			
		}
		
		if(convert(a, n))
		{
			System.out.println("Yes , possible");
		}
		else{
			System.out.println("No , its not possible");
			
		}
		

	}

}
