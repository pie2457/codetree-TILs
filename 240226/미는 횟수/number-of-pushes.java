import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        int n = 1;

        while (true) {
            if (a.equals(b)) {
                System.out.println(n);
                break;
            } 
            if(n >= a.length()) {
                System.out.println("-1");
                break;
            }
            a = a.substring(n) + a.substring(0, n);
            n++;
        }
    }
}