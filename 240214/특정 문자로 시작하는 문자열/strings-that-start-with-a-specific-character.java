import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);
        int cnt = 0;
        double total = 0;

        for(int i = 0; i < n; i++) {
            if (arr[i].charAt(0) == c) {
                cnt++;
                total += arr[i].length();
            }
        }
        System.out.print(cnt + " ");
        System.out.printf("%.2f", total / cnt);
    }
}