import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String st1 = s1.replaceAll("[^0-9]", "");
        String st2 = s2.replaceAll("[^0-9]", "");

        int sum = 0;
        sum += Integer.parseInt(st1);
        sum += Integer.parseInt(st2);

        System.out.println(sum);
    }
}