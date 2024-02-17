import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String result = "";

        for(int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                result += s.charAt(i);
            }
        }

        for(int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }
    }
}