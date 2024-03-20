import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if (s.contains("0")) {
            s = s.replaceFirst("0", "1");
        } else {
            char c = '0';
            s = s.substring(0, s.length() - 1);
            s += c;
        }

        int n = Integer.parseInt(s, 2);

        System.out.println(n);
    }
}