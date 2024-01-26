import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int arr[] = new int[10];
        
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (i == 2 || i == 4 || i == 9) {
                sum += arr[i];
            }
        }
        System.out.print(sum);
    }
}