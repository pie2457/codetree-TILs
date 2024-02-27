import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        int n = a.length() - 1;
        int cnt = 0;

        while (true) {
            if (a.equals(b)) {
                System.out.println(cnt);
                break;
            } 
            if(cnt == a.length()) {
                System.out.println("-1");
                break;
            }
            a = a.substring(n) + a.substring(0, n);
            cnt++;
        }
    }
}