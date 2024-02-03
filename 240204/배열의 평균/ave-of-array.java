import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[2][4];
        double sum = 0;
        double total = 0;

        for(int i = 0; i < 2; i++) {
            sum = 0;
            for(int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                total += arr[i][j];
            }
            System.out.printf("%.1f", sum / 4);
            System.out.print(" ");
        }
        System.out.println();
        sum = 0;

        for(int i = 0; i < 4; i++) {
            sum = arr[0][i] + arr[1][i];
            System.out.printf("%.1f", sum / 2);
            System.out.print(" ");
        }

        System.out.println();
        System.out.printf("%.1f", total / 8);
    }
}