import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int n1 = 0;
        int n2 = 0;

        for(int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
                n1++;
            } else {
                break;
            }
        }

        for(int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) >= '0' && s2.charAt(i) <= '9') {
                n2++;
            } else {
                break;
            }
        }

        int na = Integer.parseInt(s1.substring(0, n1));
        int nb = Integer.parseInt(s2.substring(0, n2));
        System.out.println(na + nb);
    }
}