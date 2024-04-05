import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		LinkedList<Character> ll = new LinkedList<>();
		int m = sc.nextInt();
		String s = sc.next();

		for(int i = 0; i < s.length(); i++) {
			ll.add(s.charAt(i));
		}

		ListIterator<Character> it = ll.listIterator(ll.size());

		for(int i = 0; i < m; i++) {
			String s1 = sc.next();

			if (s1.equals("L") && it.hasPrevious()) {
				it.previous();
			} else if (s1.equals("R") && it.hasNext()) {
				it.next();
			} else if (s1.equals("D") && it.hasNext()) {
				it.next();
				it.remove();
			} else if (s1.contains("P")) {
				char c = sc.next().charAt(0);
				it.add(c);
			}
		}
		it = ll.listIterator();

		while(it.hasNext()) {
			System.out.print(it.next());
		}
    }
}