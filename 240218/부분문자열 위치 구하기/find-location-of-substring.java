import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String st = sc.next();
        int num = -1;

        if(s.contains(st)) {
            num = s.indexOf(st);
        }
        System.out.println(num);
    }
}