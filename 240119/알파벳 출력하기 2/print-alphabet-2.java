import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char c = 'A';

        for(int i = 0; i < n; i++) {
            for(int j = n - i; j < n; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < n - i; j++) {
                System.out.print(c + " ");
                c++;
                if (c > 'Z') {
                    c = 'A';
                }
            }
            System.out.println();
        }
    }
}