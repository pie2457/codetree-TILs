import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st[] = new String[10];

        for(int i = 0; i < 10; i++) {
            st[i] = sc.next();
        }
        System.out.print(st[2 - 1] + " " + st[5 - 1] + " " + st[8-1]);
    }
}