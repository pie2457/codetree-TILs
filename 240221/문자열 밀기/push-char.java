import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        s = s.substring(1, n) + s.substring(0, 1);
        System.out.println(s);
    }
}