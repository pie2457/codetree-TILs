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

        for(int i = 1; i < n-1; i++) {
			int sum = 0;
			int x = Math.abs(arr[0][0] - arr[i][0])
				+ Math.abs(arr[0][1] - arr[i][1]);
			int y = Math.abs(arr[i][0] - arr[n-1][0])
				+ Math.abs(arr[i][1] - arr[n-1][1]);

			sum = Math.abs(x) + Math.abs(y);

			if (min > sum) {
				min = sum;
			}
		}
        System.out.println(min);
    }
}