import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String c1 = String.valueOf(s.charAt(0));
        String c2 = String.valueOf(s.charAt(1));

        System.out.println(s.replaceAll(c2, c1));
    }
}