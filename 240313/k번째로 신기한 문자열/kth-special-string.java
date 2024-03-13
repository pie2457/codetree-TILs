import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String str[] = new String[n];
		String arr[] = new String[n];
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			str[i] = sc.nextLine();

			if (startsWith(str[i], s)) {
				arr[cnt] = str[i];
				cnt++;
			}
		}

		Arrays.sort(arr, 0, cnt);
		
		System.out.print(arr[k-1]);
    }

	 static boolean startsWith(String a, String b) {
        if((int) a.length() < (int) b.length())
            return false;
    
        for(int i = 0; i < (int) b.length(); i++)
            if(a.charAt(i) != b.charAt(i))
                return false;
        
        return true;
    }
}