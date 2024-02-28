import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        min(a, b, c);
    }

    static void min(int a, int b, int c) {
        int num = Math.min(a, b);
        System.out.println(Math.min(num, c));
    }
}