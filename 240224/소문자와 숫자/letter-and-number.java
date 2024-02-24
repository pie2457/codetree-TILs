import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toLowerCase();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c >= 'a' && c <= 'z') {
                System.out.print(c);
            } else if (c >= '0' && c <= '9') {
                System.out.print(c);
            }
        }
    }
}