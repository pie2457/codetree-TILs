import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char arr[] = s.toCharArray();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            
            if (a == 1) {
                int b = sc.nextInt();
                int c = sc.nextInt();

                arr[b-1] = s.charAt(c-1);
                arr[c-1] = s.charAt(b-1);

            } else {
                char b = sc.next().charAt(0);
                char c = sc.next().charAt(0);

                for(int j = 0; j < arr.length; j++) {
                    if (arr[j] == b) {
                        arr[j] = c;
                    }
                }
            }
            s = String.valueOf(arr);
            System.out.println(s);
        }
    }
}