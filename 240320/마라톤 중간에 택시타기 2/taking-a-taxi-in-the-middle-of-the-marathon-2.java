import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[][] = new int[n][2];

		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		int sum = 0;

		for(int i = 0; i < n-1; i++) {
			int m = Math.abs(arr[i][0] - arr[i + 1][0]) + Math.abs(arr[i][1] - arr[i + 1][1]);
			sum += Math.abs(m);
		}

		for(int i = 1; i < n-1; i++) {
			int prev = Math.abs(arr[i-1][0] - arr[i][0]) + Math.abs(arr[i-1][1] - arr[i][1]);
			int next = Math.abs(arr[i][0] - arr[i+1][0]) + Math.abs(arr[i][1] - arr[i+1][1]);

			int mm = prev + next;
			int m = Math.abs(arr[i-1][0] - arr[i+1][0]) + Math.abs(arr[i-1][1] - arr[i+1][1]);

			min = Math.min(min, sum - mm + m);
		}
		System.out.println(min);
    }
}