import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String arr[][] = new String[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.next();
            }
        }
        
        int cnt = 0;

        for(int i = 1; i < n; i++)
            for(int j = 1; j < m; j++)
                for(int k = i + 1; k < n - 1; k++)
                    for(int l = j + 1; l < m - 1; l++)
                        if(!arr[0][0].equals(arr[i][j]) && 
                           !arr[i][j].equals(arr[k][l]) &&
                           !arr[k][l].equals(arr[n - 1][m - 1]))
                            cnt++;
        
        System.out.println(cnt);
    }
}