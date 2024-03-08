import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        
        System.out.println(calc(n, cnt));
    }

    static int calc(int n, int cnt) {
        while (n != 1) {
            if (n % 2 == 0) {
                cnt++;
                return calc(n / 2, cnt);
            } else {
                cnt++;
                return calc(n / 3, cnt);
            }
        }
        return cnt;
    }
}