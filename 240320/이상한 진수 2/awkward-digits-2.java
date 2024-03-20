import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = Integer.parseInt(s.replaceFirst("0", "1"), 2);

        System.out.println(n);
    }
}