import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int cnt = 0;

        for(int i = 0; i < a.length()-1; i++) {
            if (a.substring(i, i+2).equals(b)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}