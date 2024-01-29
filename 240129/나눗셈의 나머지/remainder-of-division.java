import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int arr[] = new int[11];
        int sum = 0;

        while (a > 1) {
            arr[a % b]++;
            a = a / b;
        }
        for(int i = 0; i < 11; i++) {
            sum += Math.pow(arr[i], 2);
        }
        System.out.print(sum);
    }
}