import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        int point = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] > max) {
                max = arr[i];
                point = i + 1;
            }
        }
        System.out.print(point + " ");
        
        while (point != 1) {
            max = 0;
            for(int i = 0; i < point - 1; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    point = i + 1;
                }
            }
            System.out.print(point + " ");
        }
    }
}