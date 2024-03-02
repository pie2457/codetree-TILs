import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            absolute(m);
        }
    }

    static void absolute(int n) {
        if (n < 0) {
            System.out.print(Math.abs(n) + " ");
        } else {
            System.out.print(n + " ");
        }
    }
}