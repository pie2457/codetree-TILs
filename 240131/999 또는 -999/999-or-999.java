import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int arr[] = new int[100];

        for(int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] == 999 || arr[i] == -999) {
                for(int j = 0; j < i; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                     if (arr[j] < min) {
                        min = arr[j];
                    }
                }
                break;
            }
        }
        System.out.println(max + " " + min);
    }
}