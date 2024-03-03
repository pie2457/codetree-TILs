import java.util.*;

public class Main {
    public static int arr[];
    public static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            calculator(arr, a1, a2);
        }
    }

    static void calculator(int arr[], int a1, int a2) {
        for(int i = a1 - 1; i < a2; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        sum = 0;
    }
}