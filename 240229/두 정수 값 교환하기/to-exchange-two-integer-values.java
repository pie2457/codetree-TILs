import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        swap(n, m);
    }

    static void swap(int n, int m) {
        System.out.println(m + " " + n);
    }
}