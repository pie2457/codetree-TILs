import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Number nums[] = new Number[n];
        int arr[] = new int[n+1];

        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();

            nums[i] = new Number(k, i + 1);
        }

        Arrays.sort(nums);

        for(int i = 0; i < n; i++) {
            arr[nums[i].index] = i + 1;
        }

        for(int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static class Number implements Comparable<Number> {

        int n, index;

        public Number(int n, int index) {
            this.n = n;
            this.index = index;
        }

        @Override
        public int compareTo(Number num) {
            if (this.n != num.n) {
                return this.n - num.n;
            }
            return this.index - num.index;
        }
    }
}