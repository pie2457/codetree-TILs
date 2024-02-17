import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int cnt = 1;
        char c = s.charAt(0);
        String result = "";

        for(int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cnt++;
            } else {
                result += c;
                result += cnt;
                c = s.charAt(i);
                cnt = 1;
            }
        }
        result += c;
        result += cnt;
        System.out.println(result.length());
        System.out.println(result);
    }
}