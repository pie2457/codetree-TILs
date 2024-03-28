import java.util.Scanner;

public class Main {
    public static final int MAX_N = 20;
    
    public static int n;
    public static int[][] arr = new int[MAX_N][MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        
        // Step 1.
        // 첫 번째 격자를 놓습니다. (i , j)
        int maxCnt = 0;
        for(int i = 0; i < n; i++)
            // 격자를 벗어나지 않을 범위로만 잡습니다.
            for(int j = 0; j < n - 2; j++) {
                // 두 번째 격자를 놓습니다. (k , l)
                for(int k = 0; k < n; k++) {
                    // 격자를 벗어나지 않을 범위로만 잡습니다.
                    for(int l = 0; l < n - 2; l++) {
                        // Step2. 두 격자가 겹치는 경우에는 가짓수로 세지 않습니다.
                        if(i == k && Math.abs(j - l) <= 2)
                            continue;
                        
                        // Step 3. 두 격자가 겹치지 않는 경우에 대해 동전 수를 세어 갱신해줍니다.
                        int cnt1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                        int cnt2 = arr[k][l] + arr[k][l + 1] + arr[k][l + 2];
                        maxCnt = Math.max(maxCnt, cnt1 + cnt2);
                    }
                }
            }
        
        System.out.print(maxCnt);
    }
}