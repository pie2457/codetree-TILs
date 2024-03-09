import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(calc(arr));
    }

    static int calc(int[] arr) {
        int max = 0;
        for(int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}