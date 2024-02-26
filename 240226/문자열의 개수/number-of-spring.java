import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arr = new ArrayList<>();

        String s = "";
        
        while (true) {
            s = sc.next();
            if (s.equals("0")) {
                System.out.println(arr.size());
                for(int i = 0; i < arr.size(); i+= 2) {
                    System.out.println(arr.get(i));
                }
                break;
            } else {
                arr.add(s);
            }
        }
    }
}