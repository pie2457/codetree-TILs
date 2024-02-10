import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 3; i++) {
            String s = sc.next();
            
            if(s.length() > max) {
                max = s.length();
            } if(s.length() < min) {
                min = s.length();
            }
        }
        System.out.print(max - min);
    }
}