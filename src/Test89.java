import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

//Day 90 coding Statement : 
//
//Gru has a string S of length N, consisting of only characters a and b for banana and P points to spend.
//
//Now Gru wants to replace and/or re-arrange characters of this given string to get the lexicographically smallest string possible. For this, he can perform the following two operations any number of times.
//
//Swap any two characters in the string. This operation costs 11point. (any two, need not be adjacent)
//Replace a character in the string with any other lower case english letter. This operation costs 2 points.
//Help Gru in obtaining the lexicographically smallest string possible, by using at most P points.
//
//Input:
//
//First line will contain T, number of testcases. Then the testcases follow.
//Each testcase contains two lines of input, first-line containing two integers N , P.
//The second line contains a string S consisting of N characters.
//Output: For each testcase, output in a single containing the lexicographically smallest string obtained.
public class Test89 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 PrintWriter pw=new PrintWriter(System.out);
		 int t=sc.nextInt();
		 sc.nextLine();
		 while(t-->0){
		 int n=sc.nextInt();
		 int k=sc.nextInt();
		 long c=sc.nextInt();
		 long a[]=new long[n];
		 for(int i=0;i<n;i++)a[i]=sc.nextLong();
		 Arrays.sort(a);
		 int min=0;
		 int max=n/k;
		 int ans=0;
		 while(min<=max){
		 int mid=min+(max-min)/2;
		 if(check(a,mid,k,c)){
		 ans=mid;
		 min=mid+1;
		 }
		 else
		 max=mid-1;
		 }
		 pw.println(ans);
		 }
		
		 pw.close();
		 }
		 static boolean check(long[] a,int x,int k,long c){
		 if(k*x>a.length) return false;
		 if(x==0) return true;
		 long v[][]=new long[k][x];
		 for(int i=0;i<x;i++) v[0][i]=a[i];
		 int s=x;
		 for(int i=1;i<k;i++){
		 for(int j=0;j<x;j++){
		 boolean flag=false;
		 while(s<a.length){
		 if(a[s]>=c*v[i-1][j]){
		 v[i][j]=a[s];
		 s++; flag=true;
		 break;
		 }
		 s++;
		 }
		 if(!flag) return false;
		 }
		 }

		 return true;

	}

}
