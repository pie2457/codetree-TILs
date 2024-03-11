import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        System.out.println(calc(n));
    }

    static int calc(int n) {
        if (n == 1) {
            return 2;
        } else if (n == 2) {
            return 4;
        }
        return (calc(n - 1) * calc(n - 2)) % 100;
    }
}