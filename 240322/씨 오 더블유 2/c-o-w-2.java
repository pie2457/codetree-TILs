import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char css[] = sc.next().toCharArray();

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(css[i] == 'C') {
                for(int j = i + 1; j < n; j++) {
                    if (css[j] == 'O') {
                        for(int k = j + 1; k < n; k++) {
                            if (css[k] == 'W') {
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}