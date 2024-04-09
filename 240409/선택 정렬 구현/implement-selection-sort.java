import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selection_sort(arr);
        
        for(int m : arr) {
            System.out.print(m + " ");
        }
    }

    public static int[] selection_sort(int arr[]) {
        int len = arr.length;
        for(int i = 0; i < len - 1; i++) {
            int min = i;
            for(int j = i + 1; j < len; j++)
                if(arr[min] > arr[j])
                    min = j;
            
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    return arr;
    }
}