import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        calculator(a, b);
    }

    static void calculator(int a, int b) {
       if (a > b) {
        a += 25;
        b *= 2;
       } else {
        b += 25;
        a *= 2;
       }
       System.out.println(a + " " + b);
    }
}