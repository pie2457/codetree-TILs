import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String point = sc.next();
        int time = sc.nextInt();

        Secret secret = new Secret(code, point, time);

        System.out.println("secret code : " + secret.code);
        System.out.println("meeting point : " + secret.point);
        System.out.println("time : " + secret.time);
        
    }

    static class Secret {
        String code;
        String point;
        int time;

        public Secret(String code, String point, int time) {
            this.code = code;
            this.point = point;
            this.time = time;
        }
    }
}