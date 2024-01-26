import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[10];
        int cnt = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if(n == 0) {
                break;
            } else {
                arr[i] = n;
                cnt++;
            }
        }
        for(int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}