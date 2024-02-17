import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String result = "";

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            result += s;
        }

        int num = 0;
        int len = result.length();

        for(int i = 0; i < len; i ++) {
            System.out.print(result.charAt(num));
            num++;
            if (num % 5 == 0) {
                System.out.println();
            }
        } 
    }
}