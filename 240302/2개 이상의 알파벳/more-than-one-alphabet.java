import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        different(s);
    }

    static void different(String s) {
        int cnt = 0;
        for(int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                cnt+=2;
            }
        }
        if (cnt >= 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}