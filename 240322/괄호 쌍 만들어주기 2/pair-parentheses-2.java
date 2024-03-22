import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char chars[] = sc.next().toCharArray();
        int cnt = 0;

        for(int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == '(' && chars[i+1] == '(') {
                for(int j = i + 1; j < chars.length - 1; j++) {
                    if (chars[j] == ')' && chars[j+1] == ')') {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}