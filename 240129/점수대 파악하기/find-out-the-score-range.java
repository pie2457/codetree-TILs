import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[11];

        for(int i = 0; i < 100; i++) {
            int n = sc.nextInt();

            if(n == 0) {
                break;
            } else if (n < 10) {
                continue;
            } else {
                arr[n/10]++;
            }
        }

        for(int i = 10; i >= 1; i--) {
            System.out.println(i * 10 + " - " + arr[i]);
        }
    }
}