import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oddNum = 11;

        for(int i = 0; i < n; i++) {
            int num = oddNum;
            for(int j = 0; j < n; j++) {
                System.out.print(num);
                System.out.print(" ");
                num += 2;
            }
            oddNum += 2;
            System.out.println();
        }
    }
}