import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String st = s.substring(0, 2) + s.substring(3, s.length()-2) + 
                        s.substring(s.length() - 1);
        System.out.println(st);
    }
}