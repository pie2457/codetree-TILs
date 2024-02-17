import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int cnt = 0;
        String result = "";

        for(int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                cnt++;
            } else {
                result += s.charAt(i-1);
                result += cnt + 1;
                cnt = 0;
            }
            if (s.length() - 1 == i) {
                result += s.charAt(i);
                result += cnt + 1;
            }
        }
        System.out.println(result.length());
        System.out.println(result);
    }
}