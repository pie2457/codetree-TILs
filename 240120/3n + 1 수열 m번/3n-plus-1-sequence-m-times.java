import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();

            while (a != 1) {
                if (a % 2 == 0) {
                    a /= 2;
                } else {
                    a *= 3;
                    a += 1;
                }
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}