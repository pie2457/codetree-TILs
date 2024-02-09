import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for(int i = 0; i < n; i++) {
            arr[0][i] = 1;
            arr[i][0] = 1;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[0][i] + " ");
        }
        System.out.println();

        for(int i = 1; i < n; i++) {
            System.out.print(arr[i][0] + " ");
            for(int j = 1; j < n; j++) {
                arr[i][j]= arr[i-1][j-1] + arr[i-1][j] + arr[i][j-1];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}