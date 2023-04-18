import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Day 86 coding Statement : 
//
//Mahesh got a beautiful array named A as a birthday gift from his beautiful girlfriend Namratha. There are N positive integers in that array. Mahesh loved the array so much that he started to spend a lot of time on it everyday. One day, he wrote down all possible subsets of the array. Then for each subset, he calculated the sum of elements in that subset and wrote it down on a paper. Unfortunately, Mahesh lost the beautiful array :(. He still has the paper on which he wrote all subset sums. Your task is to rebuild beautiful array A and help the couple stay happy :)
//
//Input
//
//The first line of the input contains an integer T denoting the number of test cases. First line of each test case contains one integer N, the number of elements in A. Second line of each test case contains 2^N integers, the values written on paper
//
//Output
//
//For each test case, output one line with N space separated integers in non-decreasing order.
public class Test86 {
	 public static void main(String[] args) throws IOException {
		 Scanner in = new Scanner(System.in);
		 PrintWriter out = new PrintWriter(System.out);
		 int t = in.nextInt();
		 while(t--> 0) {
		 int n = in.nextInt();
		 Map<Integer, Integer> subsets = new TreeMap<Integer, Integer>();
		 for(int i = 0; i < 1 << n; i++) {
		 int s = in.nextInt();
		 Integer prev = subsets.get(s);
		 if (prev == null)
		 prev = 0;
		 subsets.put(s, prev + 1);
		 }
		 subsets.remove(0);
		 ArrayList<Integer> nums = new ArrayList<Integer>();
		 for(int i = 0; i < n; i++) {
		 nums.add(subsets.keySet().iterator().next());
		 for(int mask = 1 << nums.size() - 1; mask < 1 << nums.size(); mask++) {
		 int s = 0;
		 for(int j = 0; j <= i; j++)
		
		 if ((mask & (1 << j)) > 0)
		 s += nums.get(j);
		 Integer cnt = subsets.get(s);
		 if (cnt == 1)
		 subsets.remove(s);
		 else
		 subsets.put(s, cnt - 1);
		 }
		 }
		 for(int i = 0; i < n; i++)
		 out.print(nums.get(i) + " " );
		 out.println();
		 }
		 in.close();
		 out.close();
		 }

}
