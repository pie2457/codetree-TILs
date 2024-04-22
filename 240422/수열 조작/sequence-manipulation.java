import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 1; i <= n; i++) {
            dq.addLast(i);
        }

        while(dq.size() != 1) {
            dq.pollFirst();
            int m = dq.pollFirst();
            dq.addLast(m);
        }

        System.out.println(dq.pollFirst());
    }
}