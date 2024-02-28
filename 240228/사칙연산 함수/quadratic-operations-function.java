import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String s = sc.next();
        int b = sc.nextInt();
        if (calculator(a, b, s) == 0) {
            System.out.println("False");
        } else {
            System.out.println(a + " " + s + " " + b + " = " + calculator(a, b, s));
        }
    }

    static int calculator(int a, int b, Stirng s) {
        if (s == "+") {
            return a + b;
        } else if (s == "-") {
            return a - b;
        } else if (s == "*") {
            return a * b;
        } else ig (s == "/") {
            return a / b;
        } else {
            return 0;
        }
    }
}