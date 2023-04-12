import java.util.Arrays;
import java.util.Scanner;

public class Test80 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			int alice = 0, bob = 0;
			for (int i = 0; i < n; i++) {
				if (i == 0 || a[i] != a[i - 1]) {
					if (alice <= bob) {
						alice++;
					} else {
						bob++;
					}
				}
			}
			if (alice == bob) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
