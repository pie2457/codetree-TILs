import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.print(s.contains("ee") ? "Yes" : "No");
        System.out.print(" ");
        System.out.print(s.contains("ab") ? "Yes" : "No");
    }
}