import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 0;
        String result = "Yes";

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
                break;
            }
        }
        for(int i = 0; i < b; i++) {
            if (arrb[i] != arra[x + i]) {
                result = "No";
                break;
            }
        }
        System.out.print(result);
    }
}