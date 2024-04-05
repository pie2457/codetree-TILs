import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Charactor> ll = new LinkedList<>();
        int m = sc.nextInt();
        String s = sc.next();

        for(int i = 0; i < s.length(); i++) {
            ll.add(s.charAt(i));
        }

        ListIterator<Character> it = ll.listIterator(ll.size());

        for(int i = 0; i < m; i++) {
            String s1 = sc.nextLine();

            if (s.equals("L") && it.hasPrevious()) {
                it.previous();
            } else if (s.equals("R") && it.hasNext()) {
                it.next();
            } else if (s.equals("D") && it.hasNext()) {
                it.next();
                it.remove();
            } else if (s.contains("P")) {
                char c = s.split(" ", 2);
                it.add(c);
            }
        }
        while(it.hasPrevious()) {
            it.previous();
        }

        while(it.hasNext()) {
            System.out.print(it.next());
        }
    }
}