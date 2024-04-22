import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("push_front")) {
                int m = sc.nextInt();
                dq.addFirst(m);
                continue;
            } else if (s.equals("push_back")) {
                int m = sc.nextInt();
                dq.addLast(m);
                continue;
            } else if (s.equals("pop_front")) {
                System.out.println(dq.pollFirst());
                continue;
            } else if (s.equals("pop_back")) {
                System.out.println(dq.pollLast());
                continue;
            } else if (s.equals("size")) {
                System.out.println(dq.size());
                continue;
            } else if (s.equals("empty")) {
                System.out.println(dq.isEmpty() ? 1 : 0);
                continue;
            } else if (s.equals("front")) {
                System.out.println(dq.peekFirst());
                continue;
            } else if (s.equals("back")) {
                System.out.println(dq.peekLast());
            }
        }
    }
}