import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubble(arr);
        for(int m : arr) {
            System.out.print(m + " ");
        }    
    }

    private static int[] bubble(int arr[]) {
        int len = arr.length;
        boolean sorted;
         do {
            sorted = true;
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    sorted = false;
                }
            }
      } while (sorted == false);
      return arr;
    }
}