import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        boolean check[] = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    check[i] = true;
                    check[j] = true;
                    continue;
                } else if (check[j] == true) {
                    continue;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            if (check[i] == false) {
                max = arr[i] > max ? arr[i] : max;
            } else {
                cnt++;
            }
        }
        System.out.print(cnt == n ? -1 : max);
    }
}