import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String s = a + b;
        int n1 = Integer.parseInt(s);

        String st = b + a;
        int n2 = Integer.parseInt(st);
        
        System.out.print(n1 + n2);
    }
}