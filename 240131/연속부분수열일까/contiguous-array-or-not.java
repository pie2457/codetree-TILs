import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = 0;
        int cnt = 0;
        String result = "No";

        int arra[] = new int[a];
        int arrb[] = new int[b];

        for(int i = 0; i < a; i++) {
            arra[i] = sc.nextInt();
        }
        for(int i = 0; i < b; i++) {
            arrb[i] = sc.nextInt();
        }

        for(int i = 0; i < a; i++) {
			if (arra[i] == arrb[0]) {
				x = i;
				for(int j = 0; j < b; j++) {
					if (arrb[j] != arra[x + j]) {
						cnt = 0;
						break;
					} else {
						cnt++;
					}
				}
			}
			if (cnt == b) {
				result = "Yes";
				break;
			}
		}
		System.out.print(result);
    }
}