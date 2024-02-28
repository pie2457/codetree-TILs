import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.round(pow(a, b)));
    }

    static double pow(int a, int b) {
        return Math.pow(a, b);
    }
}