import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][n];

		int[] dx= {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

		int max = 0;

        for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - 2; j++) {
				int sum = 0;
				for(int k = 0; k < 3; k++) {
					sum += (arr[i][j+k] + arr[i+1][j+k]);
				}
				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
    }
}