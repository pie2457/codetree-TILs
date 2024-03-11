import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        System.out.println(calc(n, cnt));
    }

    static int calc(int n, int cnt) {
        if (n == 1) {
            return cnt;
        }
        if (n % 2 == 0) {
            n /= 2;
        } else if (n % 2 != 0) {
            n = (n * 3) + 1;
        }
        cnt++;
        return calc(n, cnt);
     }
}