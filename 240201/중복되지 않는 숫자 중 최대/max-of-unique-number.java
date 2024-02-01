import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        boolean check = true;
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    check = false;
                } else {
                    check = true;
                }
            }
        }
        if (check) {
            System.out.print(max);
        } else {
            System.out.print(-1);
        }
    }
}