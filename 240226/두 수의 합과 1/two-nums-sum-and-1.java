import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        
        String s = Integer.toString(sum);
        int n = 0;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                n++;
            }
        }
        System.out.println(n);
    }
}