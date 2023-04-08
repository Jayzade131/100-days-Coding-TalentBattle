
import java.util.*;

class Test76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter test case");
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			double C = sc.nextDouble();
			int[] a = new int[N];
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			int[][] dp = new int[N + 1][N + 1];
			for (int i = 0; i <= N; i++) {
				Arrays.fill(dp[i], -1);
			}
			for (int j = N - 1; j >= 0; j--) {
				dp[0][j] = 0;
				for (int i = 1; i <= N - j; i++) {
					for (int k = 1; k <= K && j + k <= N; k++) {
						if (a[j + k - 1] >= a[j] * (int) Math.pow(C, k - 1)) {
							if (dp[i - k][j + k] != -1) {
								dp[i][j] = Math.max(dp[i][j], dp[i - k][j + k] + 1);
							}
						}
					}
				}
			}
			System.out.println(dp[N][0]);
		}
	}
}
