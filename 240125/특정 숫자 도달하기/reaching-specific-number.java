import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float sum = 0;
        int arr[] = new int[10];
        float cnt = 0;

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= 250) {
                sum += arr[i];
                cnt++;
            } else {
                break;
            }
        }
        System.out.print((int)sum + " ");
        System.out.printf("%.1f", sum / cnt);
     }
}