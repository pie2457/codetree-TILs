import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent agent[] = new Agent[5];
        int min = Integer.MAX_VALUE;
        int cnt = 0;

        for(int i = 0; i < 5; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            if (score < min) {
                min = score;
                cnt = i;
            }
            agent[i] = new Agent(name, score);
        }

        System.out.println(agent[cnt].name + " " + agent[cnt].score);
    }

    static class Agent {

        String name;
        int score;

        public Agent(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}