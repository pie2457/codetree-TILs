import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2; i <= n; i++) {
            boolean isprime = true;
            
            for(int j = 2; j < i; j++)
                if(i % j == 0) isprime = false;
            
            if(isprime)
                System.out.print(i + " ");
        }
    }
}