import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toUpperCase();
        String st = "";

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                st += String.valueOf(s.charAt(i));
            }
        }
        System.out.println(st);
    }
}