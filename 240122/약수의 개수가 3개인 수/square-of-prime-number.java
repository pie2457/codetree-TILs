import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = 0;

        for(int i = a; i <= b; i++) {
            int cnt = 0;
            int sum = 0;
            for(int j = 1; j <= a; j++) {
                if (i % j == 0) {
                    sum += j;
                    cnt++;
                }
            }
            if (cnt == 3) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}