import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n+1];

		for(int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(arr[1] + " ");

		for(int i = 2 ; i <= arr.length; i++) {
			if (i % 2 != 0) {
				Arrays.sort(arr, 0, i+1);
				System.out.print(arr[(i / 2) + 1] + " ");
			}
		}
    }
}