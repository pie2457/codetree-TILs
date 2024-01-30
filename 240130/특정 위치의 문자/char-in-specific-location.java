import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String c = sc.next();
		String arr[] = {"L", "E", "B", "R", "O", "S"};
        int cnt = -1;

        for(int i = 0; i < arr.length; i++) {
            if (c.equals(arr[i])) {
                cnt = i;
                break;
            } 
        }
        if (cnt == -1) {
            System.out.print("None");
        } else {
            System.out.print(cnt);
        }
    }
}