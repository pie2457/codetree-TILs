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
                point = i;
            }
        }
        System.out.print((point + 1) + " ");
        
        while (point != 0) {
            max = 0;
            for(int i = point-1; i >= 0; i--) {
                if (arr[i] >= max) {
                    max = arr[i];
                    point = i;
                }
            }
            System.out.print((point + 1) + " ");
        }
    }
}