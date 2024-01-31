import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int a, b, c = 0;
        int arr[] = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < q; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 3) {
                c = sc.nextInt();
            }
            if (a == 1) {
                System.out.println(arr[b]);
            } else if(a == 2) {
                int x = 0;
                for(int j = 1; j < arr.length; j++) {
                    if (arr[j] == b) {
                        x = j;
                        break;
                    }
                }
                System.out.println(x);
            } else if (a == 3) {
                for(int j = b; j <= c; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}