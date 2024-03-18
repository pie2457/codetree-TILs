import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Coordinate coor[] = new Coordinate[n];

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            coor[i] = new Coordinate(Math.abs(x) + Math.abs(y), i + 1);
        }

        Arrays.sort(coor, 0, n);

        for(int i = 0; i < n; i++) {
            System.out.println(coor[i].index);
        }
    }

    static class Coordinate implements Comparable<Coordinate> {

        int dist, index;

        public Coordinate(int dist, int index) {
            this.dist = dist;
            this.index = index;
        }

        @Override
        public int compareTo(Coordinate coordinate) {
            if (this.dist != coordinate.dist) {
                return this.dist - coordinate.dist;
            }
            return this.index - coordinate.index;
        }
    }
}