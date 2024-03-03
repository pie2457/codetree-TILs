import java.util.*;

public class Main {
    public static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        calculator(arr, m);
    }

    static void calculator(int arr[], int m) {
        while (m != 0) {
            sum += arr[m - 1];

            if (m % 2 == 0) {
                 m /= 2;
            } else {
                m -= 1;
            }
        }
        System.out.println(sum);
    }
}