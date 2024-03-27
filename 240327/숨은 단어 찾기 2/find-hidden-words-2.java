import java.util.*;

public class Main {
    
    public static boolean inRange(int x, int y, int n, int m) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int[] dx= {-1, 1, 0, 0, -1, -1, 1, 1};
		int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

        int n = sc.nextInt();
        int m = sc.nextInt();

        char arr[][] = new char[n][m];

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            for(int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				char c = 'E';
				int cnt = 1;
				if (arr[i][j] == 'L') {
					for(int k = 0; k < 8; k++) {
						int curx = i;
						int cury = j;

						int nx = curx + dx[k];
						int ny = cury + dy[k];

						if (inRange(nx, ny, n, m) == false) {
							continue;
						}

						if(arr[nx][ny] == c) {
							int mx = nx + dx[k];
							int my = ny + dy[k];
							cnt++;

							if(inRange(mx, my, n, m) == false) {
								cnt--;
								continue;
							}

							if(arr[mx][my] == c) {
								cnt++;
							} else {
								cnt--;
							}
						}

						if (cnt == 3) {
							count++;
							cnt = 1;
						}
					}
				}
			}
		}
        System.out.println(count);
    }
}