import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);
        int cnt = 0;

        for(int i = 0; i < 10; i++) {
            if (arr[i].charAt(arr[i].length() - 1) == c) {
                cnt++;
                System.out.println(arr[i]);
            }
        }
        if (cnt == 0) {
            System.out.println("None");
        }
    }
}