import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String s = sc.next().replaceAll(" ", "");
        int b = sc.nextInt();

        if (calculator(a, b, s) == 0) {
            System.out.println("False");
        } else {
            System.out.print(a + " " + s + " " + b + " = ");
            System.out.print(calculator(a, b, s));
        }
    }

    static int calculator(int a, int b, String s) {
        if (s.equals("+")) {
            return a + b;
        } else if (s.equals("-")) {
            return a - b;
        } else if (s.equals("*")) {
            return a * b;
        } else if (s.equals("/")) {
            return a / b;
        }
        return 0;
    }
}