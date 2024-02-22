import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String str = "";
        int n = s.length();

        System.out.println(s);
        
        for(int i = 1; i <= s.length(); i++) {
            str = s.substring(n-i, n) + s.substring(0, n-i);
            System.out.println(str);
        }
    }
}