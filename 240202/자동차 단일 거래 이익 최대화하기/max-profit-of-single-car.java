import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int point = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] < min) {
                point = i;
                min = arr[i];

            }
        }

        for(int i = n - 1; i > point; i--) {
           if(arr[i] - arr[point] > max) {
                max = arr[i] - arr[point];
           }
        }
        System.out.print(max);
    }
}