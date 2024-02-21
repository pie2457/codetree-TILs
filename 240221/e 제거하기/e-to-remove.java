import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = 'e';

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                s = s.substring(0, s.indexOf(c)) + s.substring(s.indexOf(c) + 1);
                break;
            }
        }
        System.out.println(s);
    }
}