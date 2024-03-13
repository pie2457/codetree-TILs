import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String str[] = new String[n];
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			str[i] = sc.next();
			if (str[i].contains(s)) {
				cnt++;
			}
		}

		int check = 0;
		String arr[] = new String[cnt];
		for(int i = 0; i < n; i++) {
			if (str[i].contains(s)) {
				arr[check] = str[i];
				check++;
			}
		}
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
    }
}