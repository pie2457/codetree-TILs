import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr[i] = modify(arr[i]);
        }
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    static int modify(int n) {
        if (n % 2 == 0) {
            return n /2 ;
        }
        return n;
    }
}