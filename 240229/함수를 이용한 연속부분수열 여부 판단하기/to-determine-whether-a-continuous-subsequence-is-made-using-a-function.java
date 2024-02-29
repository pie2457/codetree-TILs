import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arrN[] = new int[n];
        int arrM[] = new int[m];

        for(int i = 0; i < arrN.length; i++) {
            arrN[i] = sc.nextInt();
        }

        for(int i = 0; i < arrM.length; i++) {
            arrM[i] = sc.nextInt();
        }
        
        if (equalsArr(arrN, arrM)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean equalsArr(int n[], int m[]) {
        String s1 = "";

        for(int i = 0; i < n.length; i++) {
            s1 += String.valueOf(n[i]);
        }

        String s2 = "";
        for(int i = 0; i < m.length; i++) {
            s2 += String.valueOf(m[i]);
        }

        return s1.contains(s2);
    }
}