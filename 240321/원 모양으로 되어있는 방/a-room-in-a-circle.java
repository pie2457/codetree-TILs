import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n + 1];

		for(int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j <= n; j++) {
				if (i > j) {
					sum += arr[j] * Math.abs((n - i) + j);
				} else {
					sum += Math.abs(arr[j] * (j - i));
				}
			}
			if (min > sum) {
				min = sum;
			}
		}
		System.out.println(min);
    }
}