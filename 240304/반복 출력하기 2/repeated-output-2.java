import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printer(n);
    }

    static void printer(int n) {
        String s = "HelloWorld";

        if (n == 0) {
            return;
        }
        
        System.out.println(s);
        printer(n - 1);
    }
}