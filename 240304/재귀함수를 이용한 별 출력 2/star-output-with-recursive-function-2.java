import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printer(n);
    }

    static void printer(int n) {
        if (n == 0) {
            return;
        }
        for(int i = 0; i < n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();

        printer(n - 1);

        for(int i = 0; i < n; i++) {
          System.out.print("*" + " ");
        }
        System.out.println();
    }
}