import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        if (isPalindrome(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer(s);
        String st = String.valueOf(sb.reverse());

        for(int i = 0; i < st.length(); i++) {
            if (s.charAt(i) != st.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}