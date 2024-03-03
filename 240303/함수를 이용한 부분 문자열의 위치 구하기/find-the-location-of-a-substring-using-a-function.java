import java.util.*;

public class Main {

    public static int n = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String st = sc.next();

        contains(s, st);
    }

    static void contains(String s, String st) {
        if (s.contains(st)) {
            n = s.indexOf(st);
        }
        System.out.println(n);
    }
}