import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        radixSort(arr, n);

        for(int m : arr) {
            System.out.print(m + " ");
        }
    }

    public static int[] radixSort(int arr[], int n) {
        int p = 1;
        for(int i = 0; i < n; i++) {
            List<Integer>[] li = new ArrayList[10];
            for(int j = 0; j < 10; j++) {
                li[j] = new ArrayList<>();
            }

            for(int j = 0; j < n; j++) {
                int digit = (arr[j] / p) % 10;
                li[digit].add(arr[j]);
            }

            int index = 0;
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < li[j].size(); k++) {
                    arr[index++] = li[j].get(k);
                }
            }

            p *= 10;
        }
        return arr;
    }
}