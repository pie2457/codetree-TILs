import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        while(true) {
            if (a.contains(b)) {
                int n = a.indexOf(b);
                a = a.substring(0, n) + a.substring(n + b.length());
            } else {
                break;
            }
        }
        System.out.println(a);
    }
}