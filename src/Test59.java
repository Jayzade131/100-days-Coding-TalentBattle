import java.util.Scanner;

//Day 59 coding Statement : Body Mass Index
//
//You are given the height H (in metres) and mass M (in kilograms) of Anusree. The Body Mass Index (BMI) of a person is computed as M/H^2.
//
//Report the category into which Anusree falls, based on his BMI:
//
//Category 1: Underweight if BMI ≤18
//
//Category 2: Normal weight if BMI ∈{19, 20,…, 24}
//
//Category 3: Overweight if BMI ∈{25, 26,…, 29}
//
//Category 4: Obesity if BMI ≥30
public class Test59 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the test cases :");
		int t=sc.nextInt();
		int[] h=new int[t];
		int[] m=new int[t];
		for (int i = 0; i < t; i++) {
			m[i]=sc.nextInt();
			h[i]=sc.nextInt();
			
		}
		int bmi;
		for (int i = 0; i < t; i++) {
			bmi=m[i]/(h[i]*h[i]);
			
			
			if(bmi<=18)
			{
				System.out.println("1");
			}
			else if(bmi>18 && bmi<25)
			{
				System.out.println("2");
			}
			else if(bmi>24 && bmi<30)
			{
				System.out.println("3");
				
			}
			else{
				System.out.println("4");
			}
		}
		
	}

}
