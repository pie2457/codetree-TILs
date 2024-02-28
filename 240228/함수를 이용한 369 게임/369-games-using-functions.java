import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int cnt = 0;

        for(int i = n; i <= m; i++) {
            if (check(i) || divide(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static boolean check(int n) {
        return n % 3 == 0;
    }

    static boolean divide(int n) {
        String s = String.valueOf(n);
        return s.contains("3") || s.contains("6") || s.contains("9");
    }
}