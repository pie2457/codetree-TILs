import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String st[] = new String[n];

        for(int i = 0; i < n; i++) {
            st[i] = sc.next();
        }

        Arrays.sort(st);

        for(String s : st) {
            System.out.println(s);
        }
    }
}