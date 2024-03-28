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

        for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 2; j++) {
				int sum = 0;
				int sum2 = 0;
				for(int k = 0; k < 3; k++) {
					if (i + 1 < n) {
						sum += (arr[i][j+k] + arr[i+1][j+k]);
					}

					if(j + 6 <= n) {
						sum2 += (arr[i][j+3+k] + arr[i][j+k]);
					}
				}
				if (Math.max(sum, sum2) > max) {
					max = Math.max(sum, sum2);
				}
			}
		}
		System.out.println(max);
    }
}