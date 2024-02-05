import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            answer = i;
            for(int j = 0; j < n; j++) {
                System.out.print(answer + " ");
                answer += n;
            }
            System.out.println();
        }
    }
}