import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            String st = String.valueOf(s.charAt(i));
            int n = Integer.parseInt(st);
            sum += n;
        }
        System.out.println(sum);
    }
}