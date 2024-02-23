import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        int n = (int)c - 1;
        if (c == 'a') {
            n = (int)'z';
        }
        System.out.print((char)n);
    }
}