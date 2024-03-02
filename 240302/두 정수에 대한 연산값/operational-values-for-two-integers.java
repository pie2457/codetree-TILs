import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calculator(a, b));
    }

    static String calculator(int a, int b) {
       if (a > b) {
        a += 25;
        b *= 2;
       } else {
        b += 25;
        a *= 2;
       }
       return String.valueOf(a) + " " + String.valueOf(b);
    }
}