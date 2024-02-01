import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int point = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
		for(int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
				point = i;
			}
			for (int j = point; j < n; j++) {
				if (arr[j] - arr[point] > max) {
					max = arr[j] - arr[point];
				}
			}
		}
		System.out.print(max);

    }
}