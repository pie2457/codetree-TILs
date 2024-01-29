import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        for(int i = 0; i < 3; i++) {
            String s = sc.next();
            int n = sc.nextInt();

            if (s.equals("Y") && n >= 37) {
                A++;
            } else if (s.equals("N") && n >= 37) {
                B++;
            } else if (s.equals("Y") && n <= 36) {
                C++;
            } else {
                D++;
            }
        }
        System.out.print(A + " " + B + " " + C + " " + D);
        if (A >= 2) {
            System.out.print(" E");
        }
    }
}