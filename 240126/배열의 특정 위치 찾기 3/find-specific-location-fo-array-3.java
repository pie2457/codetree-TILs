import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[100];
        int sum = 0;

        for(int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                for(int j = i; j > i - 4; j--) {
                    sum += arr[j];
                }
                break;
            }
        }
        System.out.print(sum);
    }
}