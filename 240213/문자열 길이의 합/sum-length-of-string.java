import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int result = 0;
        char c = 'a';

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            result += s.length();
            
            if (s.charAt(0) == 'a') {
                cnt++;
            }
        }
        System.out.print(result + " " + cnt);
    }
}