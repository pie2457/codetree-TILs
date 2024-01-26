import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int sum = 0;
        double avg = 0;

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (i % 2 != 0) {
                sum += arr[i];
            }
            if (i == 2 || i == 5 || i == 8) {
                avg += arr[i];
            }
        }
        System.out.print(sum + " ");
        System.out.printf("%.1f", avg / 3);
    }
}