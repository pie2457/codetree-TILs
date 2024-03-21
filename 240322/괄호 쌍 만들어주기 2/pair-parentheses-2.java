import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char arr[] = sc.next().toCharArray();

        char c1 = '(';
        char c2 = ')';
        int cnt = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == c1 && arr[i+1] == c1) {
                cnt++;
            } else if (arr[i] == c2 && arr[i+1] == c2) {
                cnt++;
            }
        }
        System.out.println(cnt % 2 == 0 ? cnt : cnt - 1);
    }
}