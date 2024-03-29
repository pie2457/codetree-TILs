import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++) {
            if (isPrime(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    
    static boolean isPrime(int n) {
        for(int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return ((n % 10) + (n / 10)) % 2 == 0;
    }
}