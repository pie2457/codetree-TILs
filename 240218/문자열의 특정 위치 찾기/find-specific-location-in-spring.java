import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = sc.next().charAt(0);
        int num = 0;
        boolean check = false;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                check = true;
                num = i;
                break;
            }
        }
        if (check) {
            System.out.println(num);
        } else {
            System.out.println("No");
        }
    }
}