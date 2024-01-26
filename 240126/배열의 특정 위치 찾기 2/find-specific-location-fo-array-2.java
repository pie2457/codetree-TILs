import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int add = 0;
        int even = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if(i % 2 == 0) {
                add += n;
            } else {
                even += n;
            }
        }
        int max = Math.max(add, even);
        int min = Math.min(add, even);

        System.out.print(max - min);
    }
}