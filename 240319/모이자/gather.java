import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                sum += Math.abs(arr[j] * (i - j));
            }
            if (sum < min) {
                min = sum;
                sum = 0;
            }
        }

        System.out.println(min);
    }
}